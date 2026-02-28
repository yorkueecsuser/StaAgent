import java.util.ArrayList;

class Count {
  public static void main(String[] args) {
    final int START = 2000000000;
    int count = 0;
    for (float f = START; f < START + 50; f++)
      count++;
    // BUG: DontUseFloatTypeForLoopIndices
    System.out.println(count);
  }

  public ArrayList<Integer> showBug() {
    final int START = 2000000000;
    int count = 0;
    for (float f = START; f < START + 50; f++)
      count++;
    ArrayList<Integer> result = new ArrayList<>();
    result.add(count);
    return result;
  }
}
// Unreachable switch statement mutant
int unreachableValue = 10;
boolean unreachableCondition = false;
switch(unreachableValue) {
  case 1:
    System.out.println("This will never be printed");
    break;
  case 10:
    if (unreachableCondition) {
      System.out.println("This will never be printed");
      break;
    }
    break;
  default:
    break;
}