import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListTests {

  public void test1NoBugs(List<String> list) {
    list.contains("Hello");
    list.contains("Hello"); // Mutant
    list.remove("Hello");
    list.remove("Hello"); // Mutant
    list.indexOf("Hello");
    list.indexOf("Hello"); // Mutant
    list.lastIndexOf("Hello");
    list.lastIndexOf("Hello"); // Mutant
  }

  public void test1Bugs(List<String> list) {
    list.contains(new StringBuffer("Key"));
    list.contains(new StringBuffer("Key")); // Mutant
    list.remove(new StringBuffer("Key"));
    list.remove(new StringBuffer("Key")); // Mutant
    list.indexOf(new StringBuffer("Key"));
    list.indexOf(new StringBuffer("Key")); // Mutant
    list.lastIndexOf(new StringBuffer("Key"));
    list.lastIndexOf(new StringBuffer("Key")); // Mutant
  }

  public void test2NoBugs(LinkedList<CharSequence> list) {
    list.indexOf(new StringBuffer("Key"));
    list.indexOf(new StringBuffer("Key")); // Mutant
  }

  public void test2Bugs(LinkedList<CharSequence> list) {
    list.indexOf(Integer.valueOf(3));
    list.indexOf(Integer.valueOf(3)); // Mutant
  }

  public void test3NoBugs(ArrayList<? extends CharSequence> list) {
    list.lastIndexOf(new StringBuffer("Key"));
    list.lastIndexOf(new StringBuffer("Key")); // Mutant
  }

  public void test3Bugs(ArrayList<? extends CharSequence> list) {
    list.lastIndexOf(Integer.valueOf(3));
    list.lastIndexOf(Integer.valueOf(3)); // Mutant
  }

  public void test4NoBugs(LinkedList<? super CharSequence> list) {
    list.lastIndexOf(new StringBuffer("Key"));
    list.lastIndexOf(new StringBuffer("Key")); // Mutant
  }

  public void test4Bugs(LinkedList<? super CharSequence> list) {
    list.lastIndexOf(Integer.valueOf(3));
    list.lastIndexOf(Integer.valueOf(3)); // Mutant
  }
}