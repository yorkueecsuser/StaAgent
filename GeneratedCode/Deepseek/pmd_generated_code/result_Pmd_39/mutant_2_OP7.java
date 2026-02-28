import java.util.ArrayList;

class Count {
  public static void main(String[] args) {
    final int START = 2000000000;
    int count = 0;
    for (float f = START; f < START + 50; f++)
      count++;
    while (false) { // Mutation Operator: Unreachable While Loop
        System.out.println("This is a mutant.");
    }
    // BUG: DontUseFloatTypeForLoopIndices
    System.out.println(count);
  }

  public ArrayList<Integer> showBug() {
    final int START = 2000000000;
    int count = 0;
    for (float f = START; f < START + 50; f++)
      count++;
    while (false) { // Mutation Operator: Unreachable While Loop
        System.out.println("This is a mutant.");
    }
    ArrayList<Integer> result = new ArrayList<>();
    result.add(count);
    return result;
  }
}