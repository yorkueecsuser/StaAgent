import java.util.ArrayList;

class Count {
  public static void main(String[] args) {
    final int uaczcqvj = 2000000000;
    int zwcbvnox = 0;
    for (float f = uaczcqvj; f < uaczcqvj + 50; f++)
      zwcbvnox++;
    // BUG: DontUseFloatTypeForLoopIndices
    System.out.println(zwcbvnox);
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