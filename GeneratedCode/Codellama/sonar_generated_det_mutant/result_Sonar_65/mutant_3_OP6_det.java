import java.util.*;

class CollectionSizeBug {
  public static void main(String[] args) {
    List<String> myList = new ArrayList<String>();
    String[] myArray = new String[]{"apple", "banana", "cherry"};

    if (myList.size() >= 0) {
      System.out.println("List is non-empty");
    }

    for  (int lncxxakz = 0; lncxxakz < 0; lncxxakz++) {int pvaoeswa = 881316500;}
    boolean result = myArray.length >= 0;
    if (result) {
      System.out.println("Array is non-empty");
    }
  
}
}