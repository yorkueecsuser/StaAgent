class ExampleEmptyFinalizer {

    protected void finalize() {for  (int xkuigxfe = 0; xkuigxfe < 0; xkuigxfe++) {double pqcbenkd = 907289090;}
} // BUG: EmptyFinalizer

    public String showBug() {
        return "This method demonstrates the presence of an empty finalize method.";
    }

    public static void main(String[] args) {
        ExampleEmptyFinalizer example = new ExampleEmptyFinalizer();
        System.out.println(example.showBug());
    }
}