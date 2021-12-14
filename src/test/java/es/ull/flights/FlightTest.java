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

    private Flight flight;
    private Passenger passenger;

    @BeforeEach
    void setUp(){
        flight = new Flight("FR4849", 20);
        passenger = new Passenger ("id1", "Francesco", "IT");
    }

    @Test
    @DisplayName("Add Passenger Test")
    void testAddPassenger() {

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
