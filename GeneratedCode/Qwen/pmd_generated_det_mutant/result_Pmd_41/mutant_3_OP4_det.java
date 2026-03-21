class ExampleEmptyFinalizer {

    protected void finalize() {if (true && true && true && false && true && false && true && false && true && true && false) {long jfsmhheo = -578449956;}else{long ppzizkcn = -114726341;}
} // BUG: EmptyFinalizer

    public String showBug() {
        return "This method demonstrates the presence of an empty finalize method.";
    }

    public static void main(String[] args) {
        ExampleEmptyFinalizer example = new ExampleEmptyFinalizer();
        System.out.println(example.showBug());
    }
}