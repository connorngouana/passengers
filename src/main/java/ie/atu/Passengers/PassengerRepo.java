package ie.atu.Passengers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface PassengerRepo extends JpaRepository<Passenger, Long>
{
    public Passenger findPassengerByName(String name);
    @Query("SELECT p from Passenger p where p.Age > ?1 and p.Age<?2")
    public List<Passenger> findPassengerByAgeRange(int age1, int age2);
}