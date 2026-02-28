import java.util.Arrays;

record Person(String[] names, int age) {
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass()!= this.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return Arrays.equals(this.names, other.names) && this.age == other.age;
    }
}

class BugDemo {
    public static boolean areAgesEqual(Person p1, Person p2) {
        // Adding an unreachable if statement. Replace `getCondition()` with an actual method that returns a boolean value
        boolean shouldCheckAge = getCondition();
        if (shouldCheckAge) {
            // This code is unreachable as `getCondition()` is expected to always return false
            return p1.age == p2.age;
        }
        return false;
    }

    public static boolean showBug(Person p1, Person p2) {
        return p1.equals(p2);
    }

    public static void main(String[] args) {
        String[] names1 = {"John", "Doe"};
        String[] names2 = {"John", "Doe"};
        Person p1 = new Person(names1, 30);
        Person p2 = new Person(names2, 30);

        System.out.println(showBug(p1, p2)); // Expected: true, Actual: true (fixed comparison using overridden equals method)
        System.out.println(areAgesEqual(p1, p2)); // Expected: false, Actual: false (unreachable code)
    }

    // This is a placeholder method that returns false. Replace it with an actual method that returns a boolean value
    private static boolean getCondition() {
        return false;
    }
}