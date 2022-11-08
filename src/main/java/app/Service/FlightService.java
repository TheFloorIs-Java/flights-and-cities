package app.Service;


import app.Model.Flight;
import app.Repository.FlightRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FlightService {
    private final FlightRepo flightRepo;

    public FlightService(FlightRepo flightRepo){ this.flightRepo = flightRepo; }

    public void createFlight(Flight f){
        flightRepo.save(f); // might want to return this object
    }

    public Flight findByDepartingCity(String cityName){
        Optional<Flight> searchForFlightByCityName = this.flightRepo.findByDepartingCity( cityName);

        return searchForFlightByCityName.isPresent() ? searchForFlightByCityName.get() : null; // null if its not found
    }

    public Flight findByArrivingCity(String cityName){
        Optional<Flight> searchForFlightByCityName = this.flightRepo.findByArrivingCity( cityName);

        return searchForFlightByCityName.isPresent() ? searchForFlightByCityName.get() : null; // null if its not found
    }


}
