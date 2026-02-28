import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListTests {

  public void test1NoBugs(List<String> list) {
    String qwerasdf; // Dead store
    list.contains("Hello");
    list.remove("Hello");
    list.indexOf("Hello");
    list.lastIndexOf("Hello");
  }

  public void test1Bugs(List<String> list) {
    int zxvbnmki; // Dead store
    list.contains(new StringBuffer("Key"));
    list.remove(new StringBuffer("Key"));
    list.indexOf(new StringBuffer("Key"));
    list.lastIndexOf(new StringBuffer("Key"));
  }

  public void test2NoBugs(LinkedList<CharSequence> list) {
    char jhgfdsap; // Dead store
    list.indexOf(new StringBuffer("Key"));
  }

  public void test2Bugs(LinkedList<CharSequence> list) {
    boolean lkjhgfds; // Dead store
    list.indexOf(Integer.valueOf(3));
  }

  public void test3NoBugs(ArrayList<? extends CharSequence> list) {
    double yuiopqwe; // Dead store
    list.lastIndexOf(new StringBuffer("Key"));
  }

  public void test3Bugs(ArrayList<? extends CharSequence> list) {
    float mnbvcxza; // Dead store
    list.lastIndexOf(Integer.valueOf(3));
  }

  public void test4NoBugs(LinkedList<? super CharSequence> list) {
    long asdfghjk; // Dead store
    list.lastIndexOf(new StringBuffer("Key"));
  }

  public void test4Bugs(LinkedList<? super CharSequence> list) {
    short poiuytrew; // Dead store
    list.lastIndexOf(Integer.valueOf(3));
  }
}