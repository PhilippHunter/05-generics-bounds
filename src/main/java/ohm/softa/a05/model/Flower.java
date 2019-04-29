package ohm.softa.a05.model;

public class Flower extends Plant {

  private PlantColor color;

  public Flower(String name, String family, double height, PlantColor color) {
    super(name, family, height);

    if(color == PlantColor.GREEN)
      throw new IllegalArgumentException("Flower can't be green!");

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
