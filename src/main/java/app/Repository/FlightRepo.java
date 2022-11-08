package app.Repository;

import app.Model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FlightRepo extends JpaRepository<Flight, Integer> {

     Optional<Flight> findByDepartingCity(String cityName);
     Optional<Flight> findByArrivingCity(String cityName);
}
