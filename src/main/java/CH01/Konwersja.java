package CH01;

/*Napisz program który wczytuje zmienną całkowita i wyswietla ją w postaci binarnej, ósemkowej i szesnastkowej. Wyswietl jej odwrotność w postaci szensatkowej liczby zmiennoprzecinkowej
* */

import java.util.Scanner;

public class Konwersja {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int number =0;
    System.out.println("Enter number:");
    number = in.nextInt();
    System.out.printf("Binary: %s, Hoctal: %s, Hexdecimal %s %n",Integer.toBinaryString(number), Integer.toOctalString(number),Integer.toHexString(number));
    double reverseNumber = (double) 1/number;
    System.out.println(Double.toHexString(reverseNumber));

  }

}
