class SampleClass {

    // This is intended to be a constructor, but it is mistakenly defined as a method
    public void SampleClass() { // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
        System.out.println("This should be a constructor");
    }

    // Proper constructor
    public SampleClass(int z) {
        System.out.println("This is the proper constructor with value: " + z);
    }

    public String showBug() {
        // Call the method that looks like a constructor
        SampleClass x = new SampleClass(0); // Providing an int argument to match the existing constructor
        x.SampleClass(); // This will invoke the method that looks like a constructor
        return "showBug executed; check console output for details.";
    }

    public static void main(String[] a) {
        SampleClass b = new SampleClass(5);
        System.out.println(b.showBug());
    }
}