import java.util.ArrayList;
import java.util.List;

class AvoidFieldNameMatchingMethodName {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showBug() {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (String name : names) {
            setName(name); // BUG: AvoidFieldNameMatchingMethodName
            System.out.println(getName());
        }

        // Unreachable if-else statement
        if (false) {
            // This branch is always false, so it's unreachable
            setName("unreachable");
        } else {
            // This branch is always true, so it's unreachable
            setName("also unreachable");
        }
    }
}