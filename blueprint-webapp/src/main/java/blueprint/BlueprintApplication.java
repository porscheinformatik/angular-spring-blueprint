package blueprint;

import blueprint.backend.Car;
import blueprint.backend.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class BlueprintApplication {
  public static void main(String[] args) {
    SpringApplication.run(BlueprintApplication.class, args);
  }

  @Bean
  public CommandLineRunner carInit(CarRepository carRepository) {
    return strings -> {
      carRepository.save(new Car(1, "WVWZZZ1KZ111111", 12312, LocalDate.of(2016, 10, 14)));
      carRepository.save(new Car(2, "WVWZZZ1KZ111111", 12312, LocalDate.of(2016, 10, 14)));
      carRepository.save(new Car(3, "WVWZZZ1KZ111111", 12312, LocalDate.of(2016, 10, 14)));
    };
  }
}
