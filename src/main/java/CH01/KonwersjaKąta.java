package CH01;

import java.util.Scanner;

/*Napisz program który wczytuje liczbę całkowitą opisującą kat(który moze mieć wartosc dodatnią lub ujemną)
i normalizuje ją do wartości 0-359 stopni. Najpierw zspróbój zrobić to za pomoca operatora % a nastepnie za pomocą metody floorMod
* */
public class KonwersjaKąta {
  public static void main(String[] args) {


    Scanner in = new Scanner(System.in);
    System.out.println("Enter angle:");
    int angle = in.nextInt();
    if (angle<0 || angle>359){
      while (angle <0){
        angle += 360;
      }
      int normalizedAngle = angle%360;
      System.out.println(normalizedAngle);
    } else {
      System.out.println(angle);
    }

    angle = in.nextInt();
    int normalizedAngle = Math.floorMod(angle,360);
    System.out.println(normalizedAngle);
  }
}
