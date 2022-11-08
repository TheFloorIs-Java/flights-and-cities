package app.Controller;

import app.Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("cities/")
public class CityController {

    CityService cs;

    public CityController(CityService cs)
    {
        this.cs = cs;
    }




}
