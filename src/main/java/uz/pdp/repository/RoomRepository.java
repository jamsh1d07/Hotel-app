package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.Hotel;
import uz.pdp.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room,Integer> {
boolean existsByNumber(Integer number);
}
