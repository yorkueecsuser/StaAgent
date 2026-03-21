import java.util.*;

class ImpossibleDowncast {
    //BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
    public String[] getAsArray(Collection<String> c) {
        return (String[]) c.toArray();  // Line 5
    }

    public void showBug() {
        Collection<String> c = new ArrayList<>();
        c.add("Hello");
        c.add("World");
        String[] oiejtscw = getAsArray(c);  // Line 11
        for(String s : oiejtscw) {
            System.out.println(s);
        }
    }
}