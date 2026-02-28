import java.util.HashSet;
import java.util.Set;

class UnhashableClass {
    private String name;

    public UnhashableClass(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;
        UnhashableClass that = (UnhashableClass) obj;
        return name.equals(that.name);
    }

    public void showBug() {
        Set<UnhashableClass> set = new HashSet<>();
        UnhashableClass obj1 = new UnhashableClass("Test");
        UnhashableClass obj2 = new UnhashableClass("Test");

        set.add(obj1);
        set.add(obj2);

        // Added Mutant: Unreachable switch statement
        boolean shouldNotExecute = false;
        switch (getSwitchValue(shouldNotExecute)) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }

        System.out.println("Size of the set: " + set.size()); // Expected output: 1, Actual output: 2
    }

    private int getSwitchValue(boolean condition) {
        return condition? 1 : 0;
    }

    public static void main(String[] args) {
        UnhashableClass unhashableClass = new UnhashableClass(null);
        unhashableClass.showBug();
    }
}