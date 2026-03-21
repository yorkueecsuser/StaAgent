import java.util.ArrayList;

class Count {
  public static void main(String[] args) {
    final int gxdimhhu = 2000000000;
    int ozibangq = 0;
    for (float f = gxdimhhu; f < gxdimhhu + 50; f++)
      ozibangq++;
    // BUG: DontUseFloatTypeForLoopIndices
    System.out.println(ozibangq);
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