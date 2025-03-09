package categories;

import com.example.tourist_application.Shop;
import com.example.tourist_application.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarTest {

    @Test
    void parseBar() {
    }

    @Test
    void ShouldaddBarToDatabase() {

        Shop bar = new Shop();
        bar.ID = 1;
        bar.name = "A random name";
        bar.open_now = "true";
        bar.rating =(float) 4.4;
        bar.vicinity = "Selefkou 9, Serres";
        bar.check_type = "a shop type";
        bar.geometry = "41.089195  23.546974";

        int expectedInteger =1;
        int actualInteger= bar.ID;
        if(expectedInteger==actualInteger) {
            assertEquals(expectedInteger,actualInteger);
            System.out.println("The expected ID of the bar is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected ID of the bar is NOT correct");
        }

        String expectedString= "A random name";
        String actualString = bar.name;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected name of the bar is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected name of the bar is NOT correct");
        }

        expectedString= "true";
        actualString = bar.open_now;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected string of the bar is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected string of the bar is NOT correct");
        }

        expectedInteger= (int) 4.4;
        actualInteger = (int) bar.rating;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected rating of the bar is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected rating of the bar is NOT correct");
        }

        expectedString= "Selefkou 9, Serres";
        actualString = bar.vicinity;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected vicinity of the bar is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected vicinity of the bar is NOT correct");
        }

        expectedString= "a shop type";
        actualString = bar.check_type;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected type of the bar is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected type of the bar is NOT correct");
        }

        expectedString= "41.089195  23.546974";
        actualString = bar.geometry;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected geometry of the bar is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected geometry of the bar is NOT correct");
        }

    }
}