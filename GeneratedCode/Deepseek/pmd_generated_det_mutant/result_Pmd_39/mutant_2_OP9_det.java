import java.util.ArrayList;

class Count {
  public static void main(String[] args) {
    final int START = 2000000000;
    int count = 0;
    { float f = START; do { count++; f++; } while (f < START + 50); }
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