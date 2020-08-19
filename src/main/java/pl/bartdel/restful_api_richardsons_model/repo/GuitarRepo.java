package pl.bartdel.restful_api_richardsons_model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.bartdel.restful_api_richardsons_model.entity.Guitar;

@Repository
public interface GuitarRepo extends JpaRepository<Guitar,Long> {
}
