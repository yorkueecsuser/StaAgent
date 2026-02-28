import java.util.ArrayList;

class Count {
  public static void main(String[] args) {
    final int START = 2000000000;
    int count = 0;
    for (float f = START; f < START + 50; f++)
      count++;
    boolean condition = false; // Mutation for the Unreachable if statement
    if (condition) {
      System.out.println(count);
    }
  }

  public ArrayList<Integer> showBug() {
    final int START = 2000000000;
    int count = 0;
    for (float f = START; f < START + 50; f++)
      count++;
    boolean condition = false; // Mutation for the Unreachable if statement
    ArrayList<Integer> result = new ArrayList<>();
    if (condition) {
      result.add(count);
    }
    return result;
  }
}