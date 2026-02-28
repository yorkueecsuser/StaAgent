import java.util.ArrayList;

class Count {
  public static void main(String[] args) {
    final int START = 2000000000;
    int count = 0;
    for (float f = START; f < START + 50; f++)
      count++;
    // BUG: DontUseFloatTypeForLoopIndices
    System.out.println(count);
    boolean unreachableForLoop = true;
    if(unreachableForLoop) {
        for (float f = START; f < START + 50; f++) {
            // unreachable code
        }
    }
  }

  public ArrayList<Integer> showBug() {
    final int START = 2000000000;
    int count = 0;
    for (float f = START; f < START + 50; f++)
      count++;
    ArrayList<Integer> result = new ArrayList<>();
    result.add(count);
    boolean unreachableForLoopInShowBug = false;
    if(unreachableForLoopInShowBug) {
        for (float f = START; f < START + 50; f++) {
            // unreachable code
        }
    }
    return result;
  }
}