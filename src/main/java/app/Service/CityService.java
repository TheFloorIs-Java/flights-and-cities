package app.Service;


import app.Repository.CityRepo;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    private final CityRepo cityRepo;

    public CityService(CityRepo cityRepo) {
        this.cityRepo = cityRepo;
    }
}
