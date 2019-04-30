package ohm.softa.a05.tests.models;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;
import org.junit.jupiter.api.BeforeEach;
import ohm.softa.a05.model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlantBedTest {

  Plant flower1;
  Plant flower2;
  Plant flower3;
  Plant shrub1;
  Plant shrub2;
  Plant shrub3;
  PlantBed<Plant> bed;

  @BeforeEach
  void setup() {
    flower1 = new Flower("flower1", "flowerfamily", 22, PlantColor.RED);
    flower2 = new Flower("flower2", "flowerfamily", 23, PlantColor.BLUE);
    flower3 = new Flower("flower3", "flowerfamily", 25, PlantColor.ORANGE);
    shrub1 = new Shrub("shrub1", "shrubfamily", 21, PlantColor.GREEN);
    shrub2 = new Shrub("shrub2", "shrubfamily", 29, PlantColor.GREEN);
    shrub3 = new Shrub("shrub3", "shrubfamily", 23, PlantColor.GREEN);

    bed = new PlantBed<>();
  }

  @Test
  void addFlowers() {
    bed.add(flower1);
    bed.add(flower2);
    bed.add(flower3);
    bed.add(shrub1);
    bed.add(shrub2);
    bed.add(shrub3);

    assertEquals(bed.size(), 6);
  }

  @Test
  void testFilterByColor() {
    bed.add(flower1);
    bed.add(flower2);
    bed.add(flower3);
    bed.add(shrub1);
    bed.add(shrub2);
    bed.add(shrub3);

    SimpleList<Plant> output = bed.getPlantsByColor(PlantColor.ORANGE);
    for(Plant p : output) {
      assertEquals(p.getColor(), PlantColor.ORANGE);
    }
  }
}
