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
    boolean switchCondition = false;
    for (float f = START; f < START + 50; f++) {
      count++;
      switch (0) {
        case 1:
          switchCondition = getCondition(count);
          break;
        default:
          break;
      }
    }
    ArrayList<Integer> result = new ArrayList<>();
    result.add(count);
    return result;
  }

  public boolean getCondition(int count) {
    return count > 20;
  }
}