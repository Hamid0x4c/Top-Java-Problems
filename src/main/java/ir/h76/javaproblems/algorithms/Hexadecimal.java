package ir.h76.javaproblems.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Hexadecimal {
  private HashMap<String, Integer> hexValues;

  public Hexadecimal() {
    this.hexValues = new HashMap<>();
    hexValues.put("a", 10);
    hexValues.put("b", 11);
    hexValues.put("c", 12);
    hexValues.put("d", 13);
    hexValues.put("e", 14);
    hexValues.put("f", 15);
  }

  public int getValueOf(String hexNotation) {
    return this.hexValues.get(hexNotation.toLowerCase());
  }

  public String getKeyOf(int number) {
    for (Map.Entry<String, Integer> entry : hexValues.entrySet()) {
      if (Objects.equals(number, entry.getValue())) {
        return entry.getKey();
      }
    }
    return null;
  }
}
