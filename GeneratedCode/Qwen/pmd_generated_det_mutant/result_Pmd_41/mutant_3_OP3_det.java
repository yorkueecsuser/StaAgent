class ExampleEmptyFinalizer {

    protected void finalize() {if (true && true && false && false && false && true && true && true && true && true && false) {byte oprvsjrm = -58;}
} // BUG: EmptyFinalizer

    public String showBug() {
        return "This method demonstrates the presence of an empty finalize method.";
    }

    public static void main(String[] args) {
        ExampleEmptyFinalizer example = new ExampleEmptyFinalizer();
        System.out.println(example.showBug());
    }
}