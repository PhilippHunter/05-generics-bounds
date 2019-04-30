package ohm.softa.a05.ultility;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.model.*;

import java.util.HashMap;
import java.util.Map;

public abstract class PlantBedUltility {

  public static <T extends Plant> Map<PlantColor, SimpleList<? extends T>> splitBedByColor(PlantBed<? extends T> bed) {
    Map<PlantColor, SimpleList<? extends T>> map = new HashMap<>();

    for(PlantColor c : PlantColor.values()) {
      map.put(c, bed.getPlantsByColor(c));
    }
    return map;
  }
}
