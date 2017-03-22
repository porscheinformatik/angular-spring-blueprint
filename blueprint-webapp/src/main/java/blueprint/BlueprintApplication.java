package blueprint;

import blueprint.backend.Car;
import blueprint.backend.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.time.LocalDate;

@SpringBootApplication
public class BlueprintApplication {
  public static void main(String[] args) {
    SpringApplication.run(BlueprintApplication.class, args);
  }

  @Configuration
  public static class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * This adds the paths of the angular routes so that they always server index.html.
     * <p>
     * TODO check a nicer way of configuring this
     *
     * @param registry .
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
      registry.addViewController("/car-list").setViewName("forward:/index.html");
    }
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
