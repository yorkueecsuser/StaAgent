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
    }
}

// Mutant 1: Renaming "name" variable in "showBug()" method
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

        for (String n : names) {
            setName(n); // BUG: AvoidFieldNameMatchingMethodName
            System.out.println(getName());
        }
    }
}

// Mutant 2: Renaming "name" variable in "setName()" method
class AvoidFieldNameMatchingMethodName {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
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
    }
}

// Mutant 3: Renaming "name" variable in "getName()" method
class AvoidFieldNameMatchingMethodName {
    private String name;

    public String getName() {
        return this.name;
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
    }
}