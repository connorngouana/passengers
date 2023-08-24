package ie.atu.Passengers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@SpringBootApplication
public class PassengersApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(PassengersApplication.class, args);
	}


}
