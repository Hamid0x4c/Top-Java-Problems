package ir.h76.javaproblems.algorithms;

import java.util.ArrayList;
import java.util.HashMap;

public class HexToDecimal {

  /**
   * Convert a String containing hexadecimal to a decimal number
   *
   * @param String (Hexadecimal Value)
   * @return int (Decimal Value)
   */
  public static int HexToDecimal(String hex) {
    ArrayList<Integer> numberResults = new ArrayList<>();
    Hexadecimal h = new Hexadecimal();
    int sum = 0;
    int power = 0;

    for (int i = hex.length() - 1; i >= 0; i--) {
      char c = hex.charAt(i);
      int timesValue = (int) Math.pow(16, power);
      power++;

      if (Character.isLetter(c)) {
        // it is a hex notation, get the value
        int value = h.getValueOf(String.valueOf(c));
        numberResults.add(value * timesValue);
      } else { //its a number
        int n = Character.getNumericValue(c);
        numberResults.add(n * timesValue);
      }
    }
    // the ArrayList numberResults now contain all calculated values, just add them up
    for (int number : numberResults) {
      sum += number;
    }
    return sum;
  }
}
