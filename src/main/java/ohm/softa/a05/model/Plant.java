package ohm.softa.a05.model;

public abstract class Plant implements Comparable {

  private double height;
  private String family, name;
  private PlantColor color;

  Plant(String name, String family, double height, PlantColor color) {
    this.name = name;
    this.family = family;
    this.height = height;
    this.color = color;
  }

  public double getHeight() {
    return height;
  }

  public String getFamily() {
    return family;
  }

  public String getName() {
    return name;
  }

  public PlantColor getColor() {
    return color;
  }
}
