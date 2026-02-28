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

// Mutated Code
class MultiInjectConstructorExampleMutant {

    private String x; // Renamed variable from 'value' to 'x'

    // BUG: MoreThanOneInjectableConstructor
    public MultiInjectConstructorExampleMutant() {
        this.x = "Default Constructor";
    }

    // BUG: MoreThanOneInjectableConstructor
    public MultiInjectConstructorExampleMutant(String x) { // Renamed parameter from 'value' to 'x'
        this.x = x;
    }

    public String showBug(String input) {
        // Demonstrates the bug by instantiating the class using the two constructors
        MultiInjectConstructorExampleMutant example = new MultiInjectConstructorExampleMutant(input);
        return example.x;
    }

    public static void main(String[] args) {
        MultiInjectConstructorExampleMutant example = new MultiInjectConstructorExampleMutant();
        System.out.println(example.showBug("Injected Value"));
    }
}