package CH01;

import java.util.Scanner;

/*Napisz program który wczytuje ciagi znaków i wyświetla wszystkie zawarte w nim niepuste ciągi znaków*/
public class CiągiZnaków {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String ciąg= in.nextLine();
    printWordsSeperatly(ciąg);

  }

  private static void printWordsSeperatly(String s){
    String[] splited= s.split(" ");
    for (String str:splited
         ) {
      System.out.println(str);
    }
  }
}
