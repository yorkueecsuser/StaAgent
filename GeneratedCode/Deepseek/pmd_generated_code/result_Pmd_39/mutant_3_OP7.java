import java.util.ArrayList;

class Count {
  public static void main(String[] args) {
    final int START = 2000000000;
    int count = 0;
    for (float f = START; f < START + 50; f++)
      count++;
    // BUG: DontUseFloatTypeForLoopIndices
    System.out.println(count);

    // MUTANT: Unreachable while loop
    boolean unreachable = false;
    while (unreachable) {
      System.out.println("This is an unreachable while loop.");
    }
  }

  public ArrayList<Integer> showBug() {
    final int START = 2000000000;
    int count = 0;
    for (float f = START; f < START + 50; f++)
      count++;
    ArrayList<Integer> result = new ArrayList<>();
    result.add(count);

    // MUTANT: Unreachable while loop in showBug method
    boolean unreachable = false;
    while (unreachable) {
      System.out.println("This is an unreachable while loop in showBug method.");
    }

    return result;
  }
}