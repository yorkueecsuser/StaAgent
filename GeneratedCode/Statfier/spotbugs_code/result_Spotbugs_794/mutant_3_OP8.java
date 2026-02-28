import java.util.ArrayList;

class Ita {

  public static void main(String[] args) {
    ArrayList<String> myList = new ArrayList<String>(10);
    myList.add("Yoyoyo");
    Object[] myArray;
    String[] smallArray = new String[0];
    myArray = myList.toArray(smallArray);

    // Mutated code
    ArrayList<String> b = new ArrayList<String>(10);
    b.add("Yoyoyo");
    Object[] c;
    String[] d = new String[0];
    c = b.toArray(d);
  }
}