package categories;

import com.example.tourist_application.Shop;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeTest {

    @Test
    void parseCafe() {
    }

    @Test
    void ShouldaddCafeToDatabase() {
        Shop cafe = new Shop();
        cafe.ID = 1;
        cafe.name = "A random name";
        cafe.open_now = "true";
        cafe.rating =(float) 4.4;
        cafe.vicinity = "Selefkou 9, Serres";
        cafe.check_type = "a shop type";
        cafe.geometry = "41.089195  23.546974";

        int expectedInteger =1;
        int actualInteger= cafe.ID;
        if(expectedInteger==actualInteger) {
            assertEquals(expectedInteger,actualInteger);
            System.out.println("The expected ID of the cafe is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected ID of the cafe is NOT correct");
        }

        String expectedString= "A random name";
        String actualString = cafe.name;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected name of the cafe is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected name of the cafe is NOT correct");
        }

        expectedString= "true";
        actualString = cafe.open_now;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected string of the cafe is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected string of the cafe is NOT correct");
        }

        expectedInteger= (int) 4.4;
        actualInteger = (int) cafe.rating;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected raintg of the cafe is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected rating of the cafe is NOT correct");
        }

        expectedString= "Selefkou 9, Serres";
        actualString = cafe.vicinity;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected vicinity of the cafe is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected vicinity of the cafe is NOT correct");
        }

        expectedString= "a shop type";
        actualString = cafe.check_type;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected type of the cafe is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected type of the cafe is NOT correct");
        }

        expectedString= "41.089195  23.546974";
        actualString = cafe.geometry;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected geometry of the cafe is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected geometry of the cafe is NOT correct");
        }
    }
}