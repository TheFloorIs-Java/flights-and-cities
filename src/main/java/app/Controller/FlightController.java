package app.Controller;


import app.Model.Flight;
import app.Service.FlightService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("flights/")
@CrossOrigin
public class FlightController {

    private FlightService flightService;

    public FlightController(FlightService flightService){
        this.flightService = flightService;
    }

    @PostMapping("/")
    public /* Do we want to send back something ? */ void createFlight(@RequestBody Flight f){
        this.flightService.createFlight(f);
    }

    @GetMapping("/arrivingCity={cityName}")
    public Flight getArrivingCity(@PathVariable String cityName){
        this.flightService.findByDepartingCity(cityName);
    }

    @GetMapping("/departingCity={cityName}")
    public Flight getDepartingCity(@PathVariable String cityName){
        this.flightService.(cityName);
    }


}
