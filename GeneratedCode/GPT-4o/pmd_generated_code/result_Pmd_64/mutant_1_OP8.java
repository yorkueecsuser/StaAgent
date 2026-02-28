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

// Mutant code
class ExampleMutant {
    private int a; // Renamed from 'id'
    private String name;

    public ExampleMutant(int a, String name) { // Parameter 'id' renamed to 'a'
        this.a = a; // Renamed from 'id'
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExampleMutant example = (ExampleMutant) o;
        return a == example.a && name.equals(example.name); // Renamed from 'id'
    }

    // Mutant hashCode method
    @Override
    public int hashCode() {
        int result = a; // Renamed from 'id'
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public void showBug() {
        ExampleMutant obj1 = new ExampleMutant(1, "Example");
        ExampleMutant obj2 = new ExampleMutant(1, "Example");

        boolean isEqual = obj1.equals(obj2);
        int obj1Hash = obj1.hashCode();
        int obj2Hash = obj2.hashCode();

        System.out.println("Mutant objects are equal: " + isEqual);
        System.out.println("Mutant Object 1 hash code: " + obj1Hash);
        System.out.println("Mutant Object 2 hash code: " + obj2Hash);
    }

    public static void main(String[] args) {
        ExampleMutant example = new ExampleMutant(1, "Example");
        example.showBug();
    }
}