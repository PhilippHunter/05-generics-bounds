package ohm.softa.a05.model;

public class Shrub extends Plant {

  private PlantColor color;

  public Shrub(String name, String family, double height, PlantColor color) {
    super(name, family, height);

    if(color != PlantColor.GREEN)
      throw new IllegalArgumentException("Shrub must be green");

    this.color = color;
  }

  @Override
  public double getHeight() {
    return super.getHeight();
  }

  @Override
  public String getFamily() {
    return super.getFamily();
  }

  @Override
  public String getName() {
    return super.getName();
  }

  @Override
  public PlantColor getColor() {
    return color;
  }
}
