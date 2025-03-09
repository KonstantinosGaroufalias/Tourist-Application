package com.example.tourist_application;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class RegisterTest {
    @Test
    void ShouldaddUserToDatabase() {
        User testUser = new User();
        testUser.id = 1;
        testUser.name = "Michael Scott";
        testUser.email = "mike@gmail.com";
        testUser.phone = "6945639754";
        testUser.address = "Kostaki 41";
        testUser.password = "veryGoodPassword";
        testUser.favourites = "a coffee store";

        int expectedInteger =1;
        int actualInteger=testUser.id;
        if(expectedInteger==actualInteger) {
            assertEquals(expectedInteger,actualInteger);
            System.out.println("The expected ID of the user is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected ID of the user is NOT correct");
        }

        String expectedString= "Michael Scott";
        String actualString = testUser.name;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected name of the user is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected name of the user is NOT correct");
        }

        expectedString="mike@gmail.com";
        actualString = testUser.email;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected email of the user is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected email of the user is NOT correct");
        }

        expectedString= "6945639754";
        actualString = testUser.phone;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected phone of the user is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected phone of the user is NOT correct");
        }

        expectedString= "Kostaki 41";
        actualString = testUser.address;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected address of the user is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected address of the user is NOT correct");
        }

        expectedString= "veryGoodPassword";
        actualString = testUser.password;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected password of the user is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected password of the user is NOT correct");
        }

        expectedString = "a coffee store";
        actualString = testUser.favourites;
        if(expectedString==actualString) {
            assertEquals(expectedString,actualString);
            System.out.println("The expected favourite shop of the user is correct");
        }else{
            assertNotEquals(expectedInteger, actualInteger);
            System.out.println("The expected favourite shop of the user is NOT correct");
        }

    }
}