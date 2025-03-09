package categories;


import com.example.tourist_application.Shop;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import static java.lang.String.valueOf;

public class Cafe{

    public Cafe()
    {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=41.088904%2C23.546338&radius=2000&type=cafe&key=AIzaSyDK4M6soWgedHy4r6Cf_mLd1lyn2WbRpB8")).build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                //.thenAccept(System.out::println)
                .thenAccept(Cafe::parseCafe)
                .join();
    }
    public static  int cafeCounter;
    public static   String[] cafeName = new String[20];
    public static   Double[] cafeRate = new Double[20];
    public static  String[] cafeType = new String[20];
    public static  Boolean[] cafeStatus = new Boolean[20];

    public static void parseCafe(String responseBody) {

        JSONObject jsonObject = new JSONObject(responseBody);
        JSONArray jsonArray = jsonObject.getJSONArray("results");

        int numOfCafe = 0;
        int shopID = 0;

        for (int i = 0; i < jsonArray.length(); i++) {

            JSONObject jsonObject1 = (JSONObject) jsonArray.get(i);
            String business_status = (String) jsonObject1.get("business_status");

            JSONArray check_type = jsonObject1.getJSONArray("types");

            if (business_status.equals("OPERATIONAL")) {

                String name = (String) jsonObject1.get("name");
                System.out.println("Name: " + name);

                Boolean open_now;
                try {
                    JSONObject opening_hours = (JSONObject) jsonObject1.get("opening_hours");

                    open_now = opening_hours.getBoolean("open_now");
                } catch (Exception e) {
                    open_now = false;
                }
                System.out.println(" " + open_now);


                business_status = (String) jsonObject1.get("business_status");
                System.out.println("Business status:" + business_status);

                double rating;
                try {
                    rating = ((Number) jsonObject1.get("rating")).doubleValue();
                } catch (Exception e) {
                    rating = 0;
                }
                System.out.println("Rating:" + rating);

                String vicinity = (String) jsonObject1.get("vicinity");
                System.out.println("Vicinity: " + vicinity);

                JSONObject geometry_check = (JSONObject) jsonObject1.get("geometry");
                JSONObject location = geometry_check.getJSONObject("location");
                float longtitude = location.getFloat("lat");
                float latitude = location.getFloat("lng");
                String geometry = valueOf(longtitude)+"  "+ valueOf(latitude);
                System.out.println("Geometry: " + geometry);

                String type = check_type.getString(0)+" , "+check_type.getString(1)+" , "+check_type.getString(2);
                System.out.println("Type: " + type);

                shopID++;

                numOfCafe++;
                cafeName[i]= name;
                cafeRate[i] = rating;
                cafeStatus[i] = open_now;
                cafeType[i] = check_type.getString(0);

                addCafeToDatabase(shopID, name, valueOf(open_now)  , business_status, rating, vicinity,type,geometry, check_type);

            }
        }

                cafeCounter = numOfCafe;
    }

    public static Shop addCafeToDatabase(Integer shopID, String name, String open_now , String business_status, double rating, String vicinity, String type, String geometry, JSONArray check_type )
    {
        Shop cafe = null;

        final String DB_URL = "jdbc:mysql://localhost/testing?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try {

            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO cafe (ID, name, open_now, business_status, rating, vicinity, type,geometry) " +
                    "VALUES (?, ?, ?, ?, ?, ?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, shopID);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, open_now);
            preparedStatement.setString(4, business_status);
            preparedStatement.setDouble(5, rating);
            preparedStatement.setString(6, vicinity);
            preparedStatement.setString(7, type);
            preparedStatement.setString(8, geometry);
            preparedStatement.executeUpdate();
            //Inserting rows into the table
            int addedRows = preparedStatement.executeUpdate();
            if (addedRows > 0) {
                cafe = new Shop();
                cafe.ID = shopID;
                cafe.name = name;
                cafe.open_now = open_now;
                cafe.business_status = business_status;
                cafe.rating = (float) rating;
                cafe.vicinity = vicinity;
                cafe.check_type = type;
                cafe.geometry = geometry;

            }

            stmt.close();
            conn.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
        return cafe;
    }
}
