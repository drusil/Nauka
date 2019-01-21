package CH01;
/*Co sie stanie jesli wykonasz rzutowanie zmiennej typu double do typu int w sytacji gdy ma ona wartosć wiekszą niż najwieksza możliwa do zapisania w typie int? Spróbój*/
public class RzutowanieWiększegoDoubleNiżInt {
  public static void main(String[] args) {
    double morThanIntDouble = 21474839050.0;
    int i = (int) morThanIntDouble; //Double zostanie zamienione na maxymalny możliwy int
    System.out.println(i);
  }


}
