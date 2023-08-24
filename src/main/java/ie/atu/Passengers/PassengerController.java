package ie.atu.Passengers;


import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

@RestController
@RequestMapping(path = "api/passenger")

public class PassengerController
{
    PassengerService myService;

    public PassengerController(PassengerService myService)
    {
        this.myService = myService;
    }

    @GetMapping
    public List<Passenger> getPassengers()
    {
        return myService.getPassengers();
    }

    @PostMapping("")
    public void savePassenger(@RequestBody Passenger passenger)
    {
        myService.savePassenger(passenger);
    }

    @GetMapping ("/name/{name}")
    public void findPassengerByName(@PathVariable("name")String name )
    {
        myService.findPassengerByName(name);
    }

    @GetMapping("/delete/{count}")
    public void deletePassenger(@PathVariable ("count")long count)
    {
        myService.deletePassenger(count);
    }
    @GetMapping ("/age")
public void getPassengerByAge(@RequestParam (name ="age_start")int age1, @RequestParam(name ="age_end") int age2)
{
    myService.findPassengerBYAgeRange(age1, age2);
}

}
