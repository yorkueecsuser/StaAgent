import java.util.ArrayList;

class Ita {

  public static void main(String[] args) {
    ArrayList<String> myList = new ArrayList<String>(10);
    myList.add("Yoyoyo");
    Object[] myArray;
    String[] smallArray = new String[0];
    myArray = myList.toArray(smallArray);

    // Mutated code
    ArrayList<String> a = new ArrayList<String>(10);
    a.add("Yoyoyo");
    Object[] b;
    String[] c = new String[0];
    b = a.toArray(c);
  }
}