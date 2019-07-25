package car.application;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import car.application.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Long>{}