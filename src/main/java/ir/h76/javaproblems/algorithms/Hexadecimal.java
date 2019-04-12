package ir.h76.javaproblems.algorithms;

import java.util.HashMap;

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
}
