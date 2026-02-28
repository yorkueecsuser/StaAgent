import java.util.ArrayList;

class Count {
  public static void main(String[] args) {
    // Mutant: Renaming of variable f in the for loop
    final int START = 2000000000;
    int count = 0;
    for (float a = START; a < START + 50; a++)
      count++;
    // BUG: DontUseFloatTypeForLoopIndices
    System.out.println(count);
  }

  public ArrayList<Integer> showBug() {
    // Mutant: Renaming of variable f in the for loop
    final int START = 2000000000;
    int b = 0;
    for (float a = START; a < START + 50; a++)
      b++;
    ArrayList<Integer> result = new ArrayList<>();
    result.add(b);
    return result;
  }
}