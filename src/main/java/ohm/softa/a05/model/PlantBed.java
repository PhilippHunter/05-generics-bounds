package ohm.softa.a05.model;

import ohm.softa.a05.collections.*;

public class PlantBed<T extends Plant> {

  private final SimpleList<T> plants;

  public PlantBed() {
    plants = new SimpleListImpl<>();
  }

  public void add(T t) {
    if(t != null)
      plants.add(t);
    else
      throw new IllegalArgumentException("Can't add null!");
  }

  public int size() {
    return plants.size();
  }

  public SimpleList<T> getPlantsByColor(PlantColor color) {
    return plants.filter(o -> o.getColor() == color);
  }
}
