import java.util.ArrayList;

class Ita {

  public static void main(String[] args) {
    ArrayList<String> myList = new ArrayList<String>(10);
    myList.add("Yoyoyo");
    Object[] myArray;
    String[] smallArray = new String[0];
    myArray = myList.toArray(smallArray);

    // Mutated code
    ArrayList<String> z = new ArrayList<String>(10);
    z.add("Yoyoyo");
    Object[] b;
    String[] c = new String[0];
    b = z.toArray(c);
  }
}