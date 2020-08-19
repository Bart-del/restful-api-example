package pl.bartdel.restful_api_richardsons_model.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.bartdel.restful_api_richardsons_model.repo.GuitarRepo;

@Service
public class GuitarManager {
    private final GuitarRepo guitarRepo;

    @Autowired
    public GuitarManager(GuitarRepo guitarRepo){
        this.guitarRepo = guitarRepo;
    }
}
