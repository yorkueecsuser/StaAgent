import java.util.ArrayList;

class Count {
  public static void main(String[] args) {
    final int START = 2000000000;
    int count = 0;
    boolean shouldNotRun = false; //Mutation: make the loop unreachable by making the condition false
    for (float f = START; shouldNotRun; f++)
      count++;
    // BUG: DontUseFloatTypeForLoopIndices
    System.out.println(count);
  }

  public ArrayList<Integer> showBug() {
    final int START = 2000000000;
    int count = 0;
    boolean shouldNotRun = false; //Mutation: make the loop unreachable by making the condition false
    for (float f = START; shouldNotRun; f++)
      count++;
    ArrayList<Integer> result = new ArrayList<>();
    result.add(count);
    return result;
  }
}