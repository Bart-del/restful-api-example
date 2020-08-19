package pl.bartdel.restful_api_richardsons_model.api;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.bartdel.restful_api_richardsons_model.entity.Car;
import pl.bartdel.restful_api_richardsons_model.manager.CarManager;

import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;


@RestController
@RequestMapping(value = "api/cars", produces = {MediaType.APPLICATION_JSON_VALUE})
public class CarApi {
    private CarManager carManager;

    @Autowired
    public CarApi(CarManager carManager){
        this.carManager = carManager;
    }

    @GetMapping("/{id}")
    public ResponseEntity<EntityModel<Car>> getCarById(@PathVariable long id) {
        Link link = linkTo(CarApi.class).slash(id).withSelfRel();
        Car carById = carManager.getCarById(id);
        EntityModel<Car> carEntityModel = EntityModel.of(carById, link);
        return new ResponseEntity<>(carEntityModel, HttpStatus.OK);
    }
}
