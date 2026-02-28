class MultiInjectConstructorExample {

    private String value;

    // BUG: MoreThanOneInjectableConstructor
    public MultiInjectConstructorExample() {
        this.value = "Default Constructor";
    }

    // BUG: MoreThanOneInjectableConstructor
    public MultiInjectConstructorExample(String value) {
        this.value = value;
    }

    public String showBug(String input) {
        // Demonstrates the bug by instantiating the class using the two constructors
        MultiInjectConstructorExample example = new MultiInjectConstructorExample(input);
        return example.value;
    }

    public static void main(String[] args) {
        MultiInjectConstructorExample example = new MultiInjectConstructorExample();
        System.out.println(example.showBug("Injected Value"));
    }
}

// Mutant code
class MultiInjectConstructorExample_Mutant {

    private String x;  // Renamed from 'value'

    // BUG: MoreThanOneInjectableConstructor
    public MultiInjectConstructorExample_Mutant() {
        this.x = "Default Constructor";
    }

    // BUG: MoreThanOneInjectableConstructor
    public MultiInjectConstructorExample_Mutant(String x) {  // Renamed from 'value'
        this.x = x;
    }

    public String showBug(String input) {
        // Demonstrates the bug by instantiating the class using the two constructors
        MultiInjectConstructorExample_Mutant example = new MultiInjectConstructorExample_Mutant(input);
        return example.x;
    }

    public static void main(String[] args) {
        MultiInjectConstructorExample_Mutant example = new MultiInjectConstructorExample_Mutant();
        System.out.println(example.showBug("Injected Value"));
    }
}