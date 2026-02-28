class Example {
    private int id;
    private String name;

    public Example(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return id == example.id && name.equals(example.name);
    }

    // BUG: OverrideBothEqualsAndHashcode
    // hashCode method is missing

    public void showBug() {
        Example obj1 = new Example(1, "Example");
        Example obj2 = new Example(1, "Example");

        boolean isEqual = obj1.equals(obj2);
        int obj1Hash = obj1.hashCode(); // This will use Object's hashCode
        int obj2Hash = obj2.hashCode(); // This will use Object's hashCode

        System.out.println("Objects are equal: " + isEqual);
        System.out.println("Object 1 hash code: " + obj1Hash);
        System.out.println("Object 2 hash code: " + obj2Hash);
    }

    public static void main(String[] args) {
        Example example = new Example(1, "Example");
        example.showBug();
    }
}

// Mutant Code
class Example_m {
    private int x; // renamed 'id' to 'x'
    private String name;

    public Example_m(int x, String name) { // renamed 'id' to 'x'
        this.x = x;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example_m example = (Example_m) o;
        return x == example.x && name.equals(example.name); // renamed 'id' to 'x'
    }

    // BUG: OverrideBothEqualsAndHashcode
    // hashCode method is missing

    public void showBug() {
        Example_m obj1 = new Example_m(1, "Example");
        Example_m obj2 = new Example_m(1, "Example");

        boolean isEqual = obj1.equals(obj2);
        int obj1Hash = obj1.hashCode(); // This will use Object's hashCode
        int obj2Hash = obj2.hashCode(); // This will use Object's hashCode

        System.out.println("Objects are equal: " + isEqual);
        System.out.println("Object 1 hash code: " + obj1Hash);
        System.out.println("Object 2 hash code: " + obj2Hash);
    }

    public static void main(String[] args) {
        Example_m example = new Example_m(1, "Example");
        example.showBug();
    }
}