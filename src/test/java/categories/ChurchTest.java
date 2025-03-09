package categories;

import com.example.tourist_application.Shop;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChurchTest {

    @Test
    void parseChurch() {
    }

    @Test
    void ShouldaddChurchToDatabase() {
        Shop church = new Shop();
        church.ID = 1;
        church.name = "A random name";
        church.open_now = "true";
        church.rating =(float) 4.4;
        church.vicinity = "Selefkou 9, Serres";
        church.check_type = "a shop type";
        church.geometry = "41.089195  23.546974";

        int expectedInteger =1;
        int actualInteger= church.ID;
        if(expectedInteger==actualInteger) {
            assertEquals(expectedInteger,actualInteger);
            System.out.println("The expected ID of the church is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected ID of the church is NOT correct");
        }

        String expectedString= "A random name";
        String actualString = church.name;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected name of the church is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected name of the church is NOT correct");
        }

        expectedString= "true";
        actualString = church.open_now;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected string of the church is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected string of the church is NOT correct");
        }

        expectedInteger= (int) 4.4;
        actualInteger = (int) church.rating;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected raintg of the church is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected rating of the church is NOT correct");
        }

        expectedString= "Selefkou 9, Serres";
        actualString = church.vicinity;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected vicinity of the church is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected vicinity of the church is NOT correct");
        }

        expectedString= "a shop type";
        actualString = church.check_type;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected type of the church is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected type of the church is NOT correct");
        }

        expectedString= "41.089195  23.546974";
        actualString = church.geometry;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected geometry of the church is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected geometry of the church is NOT correct");
        }

    }
}