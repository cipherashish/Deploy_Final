package car.application;
import java.util.stream.Stream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import car.application.Car;
import car.application.CarRepository;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(CarRepository carRepository) {
        return args -> {
            Stream.of("Hyundai", "Bugati","Porsche", "Lamborghini", "Bentley").forEach(company -> {
                Car car = new Car();
                car.setName(company);
                carRepository.save(car);
            
            });
            carRepository.findAll().forEach(System.out::println);
        };
    }
}
