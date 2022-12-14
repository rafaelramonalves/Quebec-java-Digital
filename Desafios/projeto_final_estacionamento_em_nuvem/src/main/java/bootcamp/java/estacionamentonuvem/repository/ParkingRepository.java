package bootcamp.java.estacionamentonuvem.repository;

import bootcamp.java.estacionamentonuvem.model.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {

}
