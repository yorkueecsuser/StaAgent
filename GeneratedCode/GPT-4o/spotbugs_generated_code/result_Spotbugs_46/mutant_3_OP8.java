class UnwrittenFieldDemo {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        // Accessing unwrittenField will return the default value of int, which is 0
        return unwrittenField;
    }

    public static void main(String[] args) {
        UnwrittenFieldDemo demo = new UnwrittenFieldDemo();
        System.out.println("Unwritten Field Value: " + demo.showBug());
    }
}

// Mutation: Renaming user-defined variables
class UnwrittenFieldDemoMutant {

    private int x; // Renamed variable

    public int y() { // Renamed method
        return x;
    }

    public static void main(String[] z) { // Renamed parameter
        UnwrittenFieldDemoMutant a = new UnwrittenFieldDemoMutant(); // Renamed variable
        System.out.println("Unwritten Field Value: " + a.y());
    }
}