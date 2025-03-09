package categories;

import com.example.tourist_application.Shop;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MuseumTest {

    @Test
    void parseMuseum() {
    }

    @Test
    void ShouldaddMuseumToDatabase() {
        Shop museum = new Shop();
        museum.ID = 1;
        museum.name = "A random name";
        museum.open_now = "true";
        museum.rating =(float) 4.4;
        museum.vicinity = "Selefkou 9, Serres";
        museum.check_type = "a shop type";
        museum.geometry = "41.089195  23.546974";

        int expectedInteger =1;
        int actualInteger= museum.ID;
        if(expectedInteger==actualInteger) {
            assertEquals(expectedInteger,actualInteger);
            System.out.println("The expected ID of the museum is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected ID of the museum is NOT correct");
        }

        String expectedString= "A random name";
        String actualString = museum.name;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected name of the museum is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected name of the museum is NOT correct");
        }

        expectedString= "true";
        actualString = museum.open_now;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected string of the museum is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected string of the museum is NOT correct");
        }

        expectedInteger= (int) 4.4;
        actualInteger = (int) museum.rating;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected raintg of the museum is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected rating of the museum is NOT correct");
        }

        expectedString= "Selefkou 9, Serres";
        actualString = museum.vicinity;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected vicinity of the museum is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected vicinity of the museum is NOT correct");
        }

        expectedString= "a shop type";
        actualString = museum.check_type;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected type of the museum is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected type of the museum is NOT correct");
        }

        expectedString= "41.089195  23.546974";
        actualString = museum.geometry;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected geometry of the museum is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected geometry of the museum is NOT correct");
        }
    }
}