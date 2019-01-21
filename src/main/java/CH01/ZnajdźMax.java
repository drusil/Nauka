package CH01;


import java.util.Scanner;

/*kożystajac z opreatora warunkowego napisz program który wczytuje trzy liczby i wyswietla najwiekszą z nich. powtórz to samo z użyciem Math.max
 * */
public class ZnajdźMax {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int a, b, c;
    System.out.println("Enter number:");
    a = in.nextInt();
    System.out.println("Enter number:");
    b = in.nextInt();
    System.out.println("Enter number:");
    c = in.nextInt();

    int largest;
    if(a>b){
      largest = a;
    } else {
      largest = b;
    }

    if(c > largest){
      largest =c;
    }

    System.out.println("Largest number: "+ largest );

    largest=0;
    largest= Math.max(Math.max(a,b),c);
    System.out.println("Largest number: "+ largest );

  }
}
