import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCall {
    public Object[] showBug() {
        List<String> foos = new ArrayList<>();
        foos.add("foo1");
        foos.add("foo2");
        foos.add("foo3");

        // BUG: OptimizableToArrayCall
        String[] fooArray = foos.toArray(new String[0]);

        // Mutation: Renaming, renaming 'foos' to 'fooz'
        List<String> fooz = new ArrayList<>();
        fooz.add("fooz1");
        fooz.add("fooz2");
        fooz.add("fooz3");

        // Mutation: Renaming, renaming 'fooArray' to 'foozArray'
        String[] foozArray = fooz.toArray(new String[0]);

        return foozArray;
    }
}