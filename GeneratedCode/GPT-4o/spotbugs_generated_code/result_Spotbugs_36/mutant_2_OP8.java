class SampleClass {

    // This is intended to be a constructor, but it is mistakenly defined as a method
    public void SampleClass() { // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
        System.out.println("This should be a constructor");
    }

    // Proper constructor
    public SampleClass(int x) { // Renamed 'value' to 'x'
        System.out.println("This is the proper constructor with value: " + x);
    }

    public String displayBug() { // Renamed 'showBug' to 'displayBug'
        // Call the method that looks like a constructor
        SampleClass obj = new SampleClass(0); // Renamed 'instance' to 'obj'
        obj.SampleClass(); // This will invoke the method that looks like a constructor
        return "displayBug executed; check console output for details.";
    }

    public static void main(String[] args) {
        SampleClass sc = new SampleClass(5); // Renamed 'obj' to 'sc'
        System.out.println(sc.displayBug()); // Adjusted to call 'displayBug'
    }
}