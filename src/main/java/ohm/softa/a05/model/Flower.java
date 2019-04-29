package ohm.softa.a05.model;

public class Flower extends Plant {

  public Flower(String name, String family, double height, PlantColor color) {
    super(name, family, height, color);
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
    return super.getColor();
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }
}
