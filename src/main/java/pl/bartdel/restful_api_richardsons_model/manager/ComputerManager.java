package pl.bartdel.restful_api_richardsons_model.manager;

import org.springframework.stereotype.Service;
import pl.bartdel.restful_api_richardsons_model.repo.ComputerRepo;

@Service
public class ComputerManager {
    private final ComputerRepo computerRepo;

    public ComputerManager(ComputerRepo computerRepo){
        this.computerRepo = computerRepo;
    }
}
