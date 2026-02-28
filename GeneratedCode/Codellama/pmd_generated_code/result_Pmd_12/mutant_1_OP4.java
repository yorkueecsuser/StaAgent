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
            setName(name);
            System.out.println(getName());
        }

        // Unreachable if-else statement
        boolean shouldRun = false;
        if (shouldRun) {
            // code that is never executed
        } else {
            // alternative code that is always executed
        }
    }
}