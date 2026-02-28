import java.util.ArrayList;
import java.util.Collection;

class BugClass {
    public Integer[] showBug() {
        Collection<Object> c = new ArrayList<>();
        Integer obj = new Integer(1);
        c.add(obj);

        // this would trigger the rule (and throw a ClassCastException if executed)
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            Integer[] a = c.toArray(new Integer[0]);
            return a;
        }

        return new Integer[0];
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}