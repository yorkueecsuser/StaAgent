import java.util.HashSet;
import java.util.Set;

class UnhashableClass {
    //... other methods...

    public void showBug() {
        Set<UnhashableClass> set = new HashSet<>();
        UnhashableClass obj1 = new UnhashableClass("Test");
        UnhashableClass obj2 = new UnhashableClass("Test");

        // Insert unreachable switch statement
        int unreachableValue = 0;
        switch (unreachableValue) {
            case 1:
                System.out.println("This line is unreachable.");
                break;
        }

        set.add(obj1);
        set.add(obj2);

        System.out.println("Size of the set: " + set.size());
    }

    //... other methods...
}