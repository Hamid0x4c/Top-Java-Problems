package ir.h76.javaproblems.algorithms;

import java.util.ArrayList;

public class DecimalToHex {
  /**
   * Steps of converting decimal to Hexadecimal
   * 1- Divide the decimal number by 16.   Treat the division as an integer division
   * 2- Write down the remainder (in hexadecimal)
   * 3- Divide the result again by 16.  Treat the division as an integer division
   * 4- Repeat step 2 and 3 until result is 0
   * 5- The hex value is the digit sequence of the remainders from the last to first
   *
   * @param int
   * @return String
   */
  public static String convert(int dec) {
    String digits = "0123456789ABCDEF";
    if (dec <= 0) return "0";
    int base = 16;
    String hex = "";

    while (dec > 0) {
      int digit = dec % base;
      hex = digits.charAt(digit) + hex;
      dec = dec / base;
    }

    return hex;
  }
}
