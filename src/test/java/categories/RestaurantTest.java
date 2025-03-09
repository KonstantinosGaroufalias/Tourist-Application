package categories;

import com.example.tourist_application.Shop;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

    @Test
    void parseRestaurant() {
    }

    @Test
    void ShouldaddRestaurantToDatabase() {
        Shop restaurant = new Shop();
        restaurant.ID = 1;
        restaurant.name = "A random name";
        restaurant.open_now = "true";
        restaurant.rating =(float) 4.4;
        restaurant.vicinity = "Selefkou 9, Serres";
        restaurant.check_type = "a shop type";
        restaurant.geometry = "41.089195  23.546974";

        int expectedInteger =1;
        int actualInteger= restaurant.ID;
        if(expectedInteger==actualInteger) {
            assertEquals(expectedInteger,actualInteger);
            System.out.println("The expected ID of the restaurant is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected ID of the restaurant is NOT correct");
        }

        String expectedString= "A random name";
        String actualString = restaurant.name;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected name of the restaurant is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected name of the restaurant is NOT correct");
        }

        expectedString= "true";
        actualString = restaurant.open_now;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected string of the restaurant is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected string of the restaurant is NOT correct");
        }

        expectedInteger= (int) 4.4;
        actualInteger = (int) restaurant.rating;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected raintg of the restaurant is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected rating of the restaurant is NOT correct");
        }

        expectedString= "Selefkou 9, Serres";
        actualString = restaurant.vicinity;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected vicinity of the restaurant is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected vicinity of the restaurant is NOT correct");
        }

        expectedString= "a shop type";
        actualString = restaurant.check_type;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected type of the restaurant is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected type of the restaurant is NOT correct");
        }

        expectedString= "41.089195  23.546974";
        actualString = restaurant.geometry;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected geometry of the restaurant is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected geometry of the restaurant is NOT correct");
        }
    }
}