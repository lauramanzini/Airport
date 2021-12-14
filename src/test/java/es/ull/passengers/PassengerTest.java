package es.ull.passengers;

import es.ull.flights.Flight;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {

    private Passenger passenger;
    private Flight flight;
    private Flight emptyFlight;

    @BeforeEach
    void setUp() {
        passenger = new Passenger("id1", "Francesco", "IT");
        flight = new Flight("FR4849", 12);
        emptyFlight = new Flight("LB2457", 0);
    }

    @Test
    @DisplayName("Get Passenger's Country Code")
    void testGetCountryCode() {
             assertEquals("IT", passenger.getCountryCode(), "Passenger's country code");
    }

    @Test
    @DisplayName("Get Passenger's Identifier ")
    void testGetIdentifier() {
        assertEquals("id1", passenger.getIdentifier(), "Passenger's identifier");
    }

    @Test
    @DisplayName("Get Passenger's Name")
    void testGetName() {
        assertEquals("Francesco", passenger.getName(), "Passenger's name");
    }

    @Test
    @DisplayName("Passenger's toString")
    void testToString() {
        assertEquals("Passenger Francesco with identifier: id1 from IT" , passenger.toString());
    }

    @Test
    @DisplayName("Passenger joining a flight")
    void testJoinFlight() {
        assertAll("Verify is passenger is assigned correctly to a flight",
                () -> assertDoesNotThrow(()-> passenger.joinFlight(flight), "We can join a flight"),
                () -> assertEquals(flight, passenger.getFlight(), "The flight is set correctly"),
                () -> assertThrows(RuntimeException.class, () -> passenger.joinFlight(emptyFlight), "We cannot join a flight")
        );
    }



}
