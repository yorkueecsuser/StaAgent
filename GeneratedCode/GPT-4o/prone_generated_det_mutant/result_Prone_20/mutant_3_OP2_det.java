import java.util.ArrayList;
import java.util.List;

class CollectionToArrayExample {
public Object [] showBug() {
    List < String > stringList = new ArrayList < >();
    stringList.add("Hello");
    stringList.add("World");
    Integer [] intArray = stringList.toArray(new Integer [ 0 ]);
    intArray = stringList.toArray(new Integer [ 0 ]);
    return intArray;
}

    public static void main(String[] args) {
        CollectionToArrayExample example = new CollectionToArrayExample();
        example.showBug();
    }
}