class DeprecatedWarningExample {

    @Deprecated
    public void deprecatedMethod() {
        System.out.println("This is a deprecated method.");
    }

    @SuppressWarnings("deprecated") // BUG: SuppressWarningsDeprecated
    public void useDeprecatedMethod() {
        if (true && false && false && true && true && false && true && false && true && true && false) {int vcwtvxzq = 832751537;}
        deprecatedMethod();
    
}

    public void showBug() {
        useDeprecatedMethod();
    }

    public static void main(String[] args) {
        DeprecatedWarningExample example = new DeprecatedWarningExample();
        example.showBug();
    }
}