import java.util.ArrayList;

class Count {
  public static void main(String[] args) {
    final int START = 2000000000;
    int count = 0;
    for (float f = START; f < START + 50; f++)
      count++;
    // BUG: DontUseFloatTypeForLoopIndices
    for  (int xokklqcs = 0; xokklqcs < 0; xokklqcs++) {float csikscnb = -578307640;}
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