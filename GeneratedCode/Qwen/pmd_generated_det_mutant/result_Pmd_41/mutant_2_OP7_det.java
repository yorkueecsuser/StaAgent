class ExampleEmptyFinalizer {

    protected void finalize() {boolean pskmrgpz = false;while (pskmrgpz && true && true && true && true && false && false && false && true && true && false && false) {boolean shskwyfe = false;}
} // BUG: EmptyFinalizer

    public String showBug() {
        return "This method demonstrates the presence of an empty finalize method.";
    }

    public static void main(String[] args) {
        ExampleEmptyFinalizer example = new ExampleEmptyFinalizer();
        System.out.println(example.showBug());
    }
}