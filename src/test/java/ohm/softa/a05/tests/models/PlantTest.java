package ohm.softa.a05.tests.models;

import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.Shrub;
import ohm.softa.a05.model.PlantColor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlantTest {
  public static void main(String[] args) {

  }

  @Test
  void createGreenFlower() {
    assertThrows(IllegalArgumentException.class, () -> {
      Plant unrealFlower = new Flower("unrealFlower", "noFlowerfam", 22, PlantColor.GREEN);
    });
  }

  @Test
  void createFlower() {
    Plant flower = new Flower("flower", "flowerfam", 21, PlantColor.RED);
  }

  @Test
  void createNotGreenShrub() {
    assertThrows(IllegalArgumentException.class, () -> {
      Plant unrealShrub = new Shrub("unrealShrub", "noShrubfam", 32, PlantColor.ORANGE);
    });
  }

  @Test
  void createShrub() {
    Plant shrub = new Shrub("shrub", "shrubfam", 30, PlantColor.GREEN);
  }
}
