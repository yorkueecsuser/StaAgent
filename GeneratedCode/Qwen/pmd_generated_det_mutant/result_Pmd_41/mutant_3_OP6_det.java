class ExampleEmptyFinalizer {

    protected void finalize() {for  (int slmlgazj = 0; slmlgazj < 0; slmlgazj++) {short zzvbgjev = 4641;}
} // BUG: EmptyFinalizer

    public String showBug() {
        return "This method demonstrates the presence of an empty finalize method.";
    }

    public static void main(String[] args) {
        ExampleEmptyFinalizer example = new ExampleEmptyFinalizer();
        System.out.println(example.showBug());
    }
}