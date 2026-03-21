import java.util.ArrayList;

class Count {
  public static void main(String[] args) {
    final int START = 2000000000;
    int count = 0;
    for (float f = START; f < START + 50; f++)
      count++;
    // BUG: DontUseFloatTypeForLoopIndices
    int ghfezfve = 0;switch  (ghfezfve) {case 1:String cvdhbulj = "risrusro";break;default:long zauamaog = -271018059;break;}
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