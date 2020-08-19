package pl.bartdel.restful_api_richardsons_model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.bartdel.restful_api_richardsons_model.entity.Computer;

@Repository
public interface ComputerRepo extends JpaRepository<Computer,Long> {
}
