package CH01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*Napisz program który wyswietla zestaw liczb do Lotto 1z49*/
public class Lotto {
  private static Random random = new Random();
  public static void main(String[] args) {
    List<Integer> lotto = fillTheArray(49);
    List<Integer> chosenNumbers = getWinningNumbers(lotto,6);
    System.out.println(chosenNumbers);

  }

  private static List<Integer> getWinningNumbers(List<Integer> numbers,int howMany) {
  List<Integer> winingNumbers = new ArrayList<>();

  for (int i = 1; i <=howMany ; i++) {
    int drawANumber = random.nextInt(numbers.size()) ;
       int winningNumber = numbers.remove(drawANumber);
       winingNumbers.add(winningNumber);
    }
    Collections.sort(winingNumbers);
  return winingNumbers;
  }

  private static List<Integer> fillTheArray(int maxNumber) {
    List<Integer> numbersToPick = new ArrayList<>();
    for (int i = 1; i <=maxNumber ; i++) {
      numbersToPick.add(i);
    }
    return numbersToPick;
  }
}
