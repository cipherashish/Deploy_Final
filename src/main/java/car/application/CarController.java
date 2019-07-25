package car.application;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import car.application.Car;
import car.application.CarRepository;

@RestController
@CrossOrigin(origins = "http://18.224.182.74:8000")
public class CarController {

	 private final CarRepository CarRepository;
	 	
	    public  CarController(CarRepository carRepository) {
	        this.CarRepository = carRepository;
	    }

	    @GetMapping("/test")
	    public List<Car> getcars() {
	    	  return (List<Car>) CarRepository.findAll();
	    }

	    @PostMapping("/addcar")
	    void addcar(@RequestBody Car car) {
	        CarRepository.save(car);
	    }
}
