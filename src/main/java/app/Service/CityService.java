package app.Service;


import app.Model.City;
import app.Repository.CityRepo;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    private final CityRepo cityRepo;

    public CityService(CityRepo cityRepo) {
        this.cityRepo = cityRepo;
    }


    public City addCity(City c){
        return this.cityRepo.save(c); // might want to return this object
    }

    public void deleteCity(int id) {
        cityRepo.deleteById(id);
    }

}
