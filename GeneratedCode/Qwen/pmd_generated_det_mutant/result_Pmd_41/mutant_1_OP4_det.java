class ExampleEmptyFinalizer {

    protected void finalize() {if (false && false && false && false && true && true && false && true && true && true && false) {byte tfopewut = 38;}else{byte xvpcmibd = -43;}
} // BUG: EmptyFinalizer

    public String showBug() {
        return "This method demonstrates the presence of an empty finalize method.";
    }

    public static void main(String[] args) {
        ExampleEmptyFinalizer example = new ExampleEmptyFinalizer();
        System.out.println(example.showBug());
    }
}