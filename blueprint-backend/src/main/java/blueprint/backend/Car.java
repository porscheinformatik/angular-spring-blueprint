package blueprint.backend;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class Car {

  @Id
  private Integer id;
  private String vin;
  private Integer km;
  private LocalDate initalRegistrationDate;
  private CarConfiguration configuration;

  Car() {
  }

  public Car(Integer id, String vin, Integer km, LocalDate initalRegistrationDate) {
    this.id = id;
    this.vin = vin;
    this.km = km;
    this.initalRegistrationDate = initalRegistrationDate;
  }

  public Integer getId() {
    return id;
  }

  public String getVin() {
    return vin;
  }

  public Integer getKm() {
    return km;
  }

  public LocalDate getInitalRegistrationDate() {
    return initalRegistrationDate;
  }

  public CarConfiguration getConfiguration() {
    return configuration;
  }
}
