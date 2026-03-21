import java.util.*;

class ImpossibleDowncast {
    //BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
    public String[] getAsArray(Collection<String> c) {
        return (String[]) c.toArray();  // Line 5
    }
public void showBug() {
    Collection < String > c = new ArrayList < >();
    c.add("Hello");
    c.add("World");
    String [] arr = getAsArray(c);
    arr = getAsArray(c);
    for(String s : arr){ System.out.println(s); }
}
}