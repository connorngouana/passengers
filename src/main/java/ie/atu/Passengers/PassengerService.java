package ie.atu.Passengers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@AllArgsConstructor
@Service
public class PassengerService
{
    private final PassengerRepo passengerRepo;

    public List<Passenger> getPassengers()
    {
        return passengerRepo.findAll();
    }

public void savePassenger(Passenger passenger)
{
    passengerRepo.save(passenger);
}
    public void findPassengerByName(String name)
    {
        passengerRepo.findPassengerByName(name);
    }

    public void deletePassenger(long count)
    {
        passengerRepo.deleteById(count);
    }
    public void findPassengerBYAgeRange(int age1, int age2)
    {
        passengerRepo.findPassengerByAgeRange(age1, age2);
    }


}
