class ExampleEmptyFinalizer {

    protected void finalize() {if (true && false && true && true && false && true && true && false && true && false && false) {String eolrlvlj = "ldefrrxq";}else{char xsulhxaq = 'x';}
} // BUG: EmptyFinalizer

    public String showBug() {
        return "This method demonstrates the presence of an empty finalize method.";
    }

    public static void main(String[] args) {
        ExampleEmptyFinalizer example = new ExampleEmptyFinalizer();
        System.out.println(example.showBug());
    }
}