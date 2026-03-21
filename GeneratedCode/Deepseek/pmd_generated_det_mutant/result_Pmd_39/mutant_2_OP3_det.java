import java.util.ArrayList;

class Count {
  public static void main(String[] args) {
    final int START = 2000000000;
    int count = 0;
    for (float f = START; f < START + 50; f++)
      count++;
    // BUG: DontUseFloatTypeForLoopIndices
    if (true && false && false && true && true && true && true && true && false && false && false) {int ykzkvnbn = -262827547;}
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