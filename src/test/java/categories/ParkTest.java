package categories;

import com.example.tourist_application.Shop;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkTest {

    @Test
    void parsePark() {
    }

    @Test
    void ShouldaddParkToDatabase() {
        Shop park = new Shop();
        park.ID = 1;
        park.name = "A random name";
        park.open_now = "true";
        park.rating =(float) 4.4;
        park.vicinity = "Selefkou 9, Serres";
        park.check_type = "a shop type";
        park.geometry = "41.089195  23.546974";

        int expectedInteger =1;
        int actualInteger= park.ID;
        if(expectedInteger==actualInteger) {
            assertEquals(expectedInteger,actualInteger);
            System.out.println("The expected ID of the park is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected ID of the park is NOT correct");
        }

        String expectedString= "A random name";
        String actualString = park.name;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected name of the park is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected name of the park is NOT correct");
        }

        expectedString= "true";
        actualString = park.open_now;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected string of the park is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected string of the park is NOT correct");
        }

        expectedInteger= (int) 4.4;
        actualInteger = (int) park.rating;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected raintg of the park is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected rating of the park is NOT correct");
        }

        expectedString= "Selefkou 9, Serres";
        actualString = park.vicinity;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected vicinity of the park is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected vicinity of the park is NOT correct");
        }

        expectedString= "a shop type";
        actualString = park.check_type;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected type of the park is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected type of the park is NOT correct");
        }

        expectedString= "41.089195  23.546974";
        actualString = park.geometry;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected geometry of the park is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected geometry of the park is NOT correct");
        }
    }
}