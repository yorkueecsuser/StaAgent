class MultiInjectConstructorExample {

    private String value;

    // BUG: MoreThanOneInjectableConstructor
    public MultiInjectConstructorExample() {
        this.value = "Default Constructor";
        this.value = "Default Constructor"; // Mutation: Duplicate assignment
    }

    // BUG: MoreThanOneInjectableConstructor
    public MultiInjectConstructorExample(String value) {
        this.value = value;
        this.value = value; // Mutation: Duplicate assignment
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