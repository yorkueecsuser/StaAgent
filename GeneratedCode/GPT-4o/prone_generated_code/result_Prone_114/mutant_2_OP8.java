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

// Mutant Code
class MultiInjectConstructorExampleMutant {

    private String v; // variable renamed from 'value' to 'v'

    // BUG: MoreThanOneInjectableConstructor
    public MultiInjectConstructorExampleMutant() {
        this.v = "Default Constructor";
    }

    // BUG: MoreThanOneInjectableConstructor
    public MultiInjectConstructorExampleMutant(String value) {
        this.v = value;
    }

    public String showBug(String input) {
        // Demonstrates the bug by instantiating the class using the two constructors
        MultiInjectConstructorExampleMutant example = new MultiInjectConstructorExampleMutant(input);
        return example.v;
    }

    public static void main(String[] args) {
        MultiInjectConstructorExampleMutant example = new MultiInjectConstructorExampleMutant();
        System.out.println(example.showBug("Injected Value"));
    }
}