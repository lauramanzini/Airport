package es.ull.flights;

import es.ull.passengers.Passenger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Flight Test")
public class FlightTest {

    private Flight Paris, Milan, London;
    private Passenger Maria, Cleo, Luca;


    @BeforeEach
    void setUp(){
        Paris = new Flight("LU123X", 20);
        Milan = new Flight ("PC568L", 13);
        London = new Flight("ML468N", 2);
        Maria = new Passenger("identifier1", "Maria", "ESP");
        Cleo = new Passenger ("identifier2", "Cleo", "FRA");
        Luca = new Passenger ("identifier3", "Luca", "ITA");
    }

    @Test
    @DisplayName("Add Passenger Test")
    void testAddPassenger() {
        assertAll(
                () -> assertTrue(Paris.addPassenger(Maria), "Passenger was able to book the flight"),
                () -> assertThrows(RuntimeException.class, ()-> Paris.addPassenger(Maria), "Passenger was not able to book the flight")
                );
    }

    @Test
    @DisplayName("Get Flight Number")
    void testGetFlightNumber() {

    }

    @Test
    @DisplayName("Get Number Of Passengers")
    void testGetNumberOfPassengers() {

    }

    @Test
    @DisplayName("Remove Passenger Test")
    void testRemovePassenger() {

    }
}
