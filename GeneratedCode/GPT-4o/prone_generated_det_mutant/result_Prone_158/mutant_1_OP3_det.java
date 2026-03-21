class DeprecatedWarningExample {

    @Deprecated
    public void deprecatedMethod() {
        System.out.println("This is a deprecated method.");
    }

    @SuppressWarnings("deprecated") // BUG: SuppressWarningsDeprecated
    public void useDeprecatedMethod() {
        if (false && false && true && false && false && false && false && true && false && false && false) {char htchuuto = 'y';}
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