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

// Mutated code
class UnwrittenFieldDemoMutant {

    private int x; // Renamed from unwrittenField 

    public int display() { // Renamed from showBug
        // Accessing x will return the default value of int, which is 0
        return x;
    }

    public static void main(String[] y) { // Renamed from args
        UnwrittenFieldDemoMutant example = new UnwrittenFieldDemoMutant(); // Renamed from demo
        System.out.println("Unwritten Field Value: " + example.display());
    }
}