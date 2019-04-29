package ohm.softa.a05.model;

public abstract class Plant implements Comparable<Plant> {

  private double height;
  private String family, name;

  Plant(String name, String family, double height) {
    this.name = name;
    this.family = family;
    this.height = height;
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

  public abstract PlantColor getColor();

  @Override
  public int compareTo(Plant o) {
    return Double.compare(this.height, o.height);
  }
}
