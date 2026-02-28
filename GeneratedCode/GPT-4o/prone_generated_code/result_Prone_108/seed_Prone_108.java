import java.util.ArrayList;
import java.util.List;

// A simple EqualsTester class to demonstrate the MissingTestCall bug
class EqualsTester {
    private final List<List<Object>> equalityGroups = new ArrayList<>();

    public EqualsTester addEqualityGroup(Object... group) {
        List<Object> groupList = new ArrayList<>();
        for (Object obj : group) {
            groupList.add(obj);
        }
        equalityGroups.add(groupList);
        return this;
    }

    public void testEquals() {
        for (List<Object> group : equalityGroups) {
            for (Object obj1 : group) {
                for (Object obj2 : group) {
                    if (!obj1.equals(obj2)) {
                        throw new AssertionError("Objects in the same group should be equal: " + obj1 + " and " + obj2);
                    }
                }
            }
        }
    }
}

class EqualityChecker {

    public void showBug() {
        EqualsTester equalsTester = new EqualsTester()
            .addEqualityGroup("hello", new String("hello"))
            .addEqualityGroup("world", new String("world"))
            .addEqualityGroup(2, Integer.valueOf(2));
        // BUG: MissingTestCall - forgot to call `testEquals()`
    }
}