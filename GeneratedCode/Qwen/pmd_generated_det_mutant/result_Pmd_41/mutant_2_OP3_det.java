class ExampleEmptyFinalizer {

    protected void finalize() {if (true && false && true && false && true && true && true && true && true && true && false) {long tvvuwxhb = -259385946;}
} // BUG: EmptyFinalizer

    public String showBug() {
        return "This method demonstrates the presence of an empty finalize method.";
    }

    public static void main(String[] args) {
        ExampleEmptyFinalizer example = new ExampleEmptyFinalizer();
        System.out.println(example.showBug());
    }
}