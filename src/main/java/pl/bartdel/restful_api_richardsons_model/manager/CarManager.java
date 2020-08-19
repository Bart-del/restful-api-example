package pl.bartdel.restful_api_richardsons_model.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.bartdel.restful_api_richardsons_model.entity.Car;
import pl.bartdel.restful_api_richardsons_model.repo.CarRepo;

import java.util.Optional;


@Service
public class CarManager {
    private final CarRepo carRepo;

    @Autowired
    public CarManager(CarRepo carRepo){
        this.carRepo = carRepo;
    }

    public Car getCarById(Long id){
        return carRepo.getById(id);
    }
}
