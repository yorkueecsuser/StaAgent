import java.util.ArrayList;

class Count {
  public static void main(String[] args) {
    final int uxllfkqr = 2000000000;
    int qmmfaqcd = 0;
    for (float f = uxllfkqr; f < uxllfkqr + 50; f++)
      qmmfaqcd++;
    // BUG: DontUseFloatTypeForLoopIndices
    System.out.println(qmmfaqcd);
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