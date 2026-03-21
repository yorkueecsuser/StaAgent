class ExampleEmptyFinalizer {

    protected void finalize() {if (false && true && true && true && false && true && true && true && true && true && false) {String gbemsslk = "ffqcyfie";}
} // BUG: EmptyFinalizer

    public String showBug() {
        return "This method demonstrates the presence of an empty finalize method.";
    }

    public static void main(String[] args) {
        ExampleEmptyFinalizer example = new ExampleEmptyFinalizer();
        System.out.println(example.showBug());
    }
}