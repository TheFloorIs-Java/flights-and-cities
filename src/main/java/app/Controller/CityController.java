package app.Controller;

import app.Model.City;
import app.Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("cities/")
public class CityController {

    CityService cs;

    public CityController(CityService cs)
    {
        this.cs = cs;
    }

    @GetMapping("/add={cityName}")
    public /* City ? */ void createCity(@PathVariable  String cityName){
        City c = new City(1, cityName);
        this.cs.addCity(c);
    }

    @DeleteMapping("/{cityId}")
    public void deleteCity(@PathVariable("id") int id)
    {
        cs.deleteCity(id);
    }
}
