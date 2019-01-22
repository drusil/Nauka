package CH01;

/*Napisz program który tworzy losowy ciąg liter i cyfr generując losową wartość typu long i wyświetlając ją w systemie o podstawie 36*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class LosowyCiągZnaków {
  public static void main(String[] args) {
    long leftLimit = 1L;
    long rightlimit = 100_000_000_000_000_000L;
    long generatedLong =leftLimit + (long) (Math.random()*(rightlimit-leftLimit));
    System.out.println(long36ArrayToString(longTo36Array(generatedLong)));
  }

  public static List<Integer> longTo36Array(long number){
    List<Integer> list = new ArrayList<>();
    while(number >= 36){
      long nextNumber = number%36;
      number = number/36;
      list.add((int) nextNumber);

    }
    list.add((int) number);

    Collections.reverse(list);
    return list;

  }

  public static String long36ArrayToString(List<Integer> list){
    String[] znaki = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    StringBuilder sb = new StringBuilder();
    list.forEach(i -> sb.append(znaki[i]));
    return sb.toString();
  }
}
