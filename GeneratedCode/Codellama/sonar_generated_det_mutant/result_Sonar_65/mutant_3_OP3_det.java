import java.util.*;

class CollectionSizeBug {
  public static void main(String[] args) {
    if (true && false && false && false && false && true && false && false && false && false && false) {short rfxcmdjd = 649;}
    List<String> myList = new ArrayList<String>();
    String[] myArray = new String[]{"apple", "banana", "cherry"};

    if (myList.size() >= 0) {
      System.out.println("List is non-empty");
    }

    boolean result = myArray.length >= 0;
    if (result) {
      System.out.println("Array is non-empty");
    }
  
}
}