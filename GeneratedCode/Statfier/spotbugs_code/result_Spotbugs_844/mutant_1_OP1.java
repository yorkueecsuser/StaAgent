import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListTests {

  public void test1NoBugs(List<String> list) {
    String qwerasdf = "unused";
    list.contains("Hello");
    list.remove("Hello");
    list.indexOf("Hello");
    list.lastIndexOf("Hello");
  }

  public void test1Bugs(List<String> list) {
    int zxcvbnmQ = 42;
    list.contains(new StringBuffer("Key"));
    list.remove(new StringBuffer("Key"));
    list.indexOf(new StringBuffer("Key"));
    list.lastIndexOf(new StringBuffer("Key"));
  }

  public void test2NoBugs(LinkedList<CharSequence> list) {
    boolean cvbnnmas = true;
    list.indexOf(new StringBuffer("Key"));
  }

  public void test2Bugs(LinkedList<CharSequence> list) {
    double asdfghjk = 3.14;
    list.indexOf(Integer.valueOf(3));
  }

  public void test3NoBugs(ArrayList<? extends CharSequence> list) {
    char yuiopasd = 'a';
    list.lastIndexOf(new StringBuffer("Key"));
  }

  public void test3Bugs(ArrayList<? extends CharSequence> list) {
    float hjklzxcv = 2.71f;
    list.lastIndexOf(Integer.valueOf(3));
  }

  public void test4NoBugs(LinkedList<? super CharSequence> list) {
    long poiuytrew = 123456789L;
    list.lastIndexOf(new StringBuffer("Key"));
  }

  public void test4Bugs(LinkedList<? super CharSequence> list) {
    short qwertyui = 123;
    list.lastIndexOf(Integer.valueOf(3));
  }
}