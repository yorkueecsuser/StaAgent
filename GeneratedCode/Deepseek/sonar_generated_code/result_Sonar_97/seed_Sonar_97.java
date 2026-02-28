import java.util.Random;

class MathAbsNegationBug {

  public void showBug() {
    Random rand = new Random();
    int randomNum = rand.nextInt();

    if (Math.abs(randomNum)!= 0) { // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
      //...
    }
  }
}