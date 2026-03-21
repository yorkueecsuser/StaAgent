import java.util.*;

class CollectionSizeBug {
  public static void main(String[] args) {
    List<String> myList = new ArrayList<String>();
    String[] mymykrtc = new String[]{"apple", "banana", "cherry"};

    if (myList.size() >= 0) {
      System.out.println("List is non-empty");
    }

    boolean mrfvhwqg = mymykrtc.length >= 0;
    if (mrfvhwqg) {
      System.out.println("Array is non-empty");
    }
  }
}