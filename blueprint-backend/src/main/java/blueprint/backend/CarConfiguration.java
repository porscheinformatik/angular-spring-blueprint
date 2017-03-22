package blueprint.backend;

public class CarConfiguration {
  private String modelCode;
  private Integer modelYear;
  private Equipment[] optionalEquipment;

  public String getModelCode() {
    return modelCode;
  }

  public Integer getModelYear() {
    return modelYear;
  }

  public Equipment[] getOptionalEquipment() {
    return optionalEquipment;
  }
}
