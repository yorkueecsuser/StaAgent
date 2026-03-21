class DeprecatedWarningExample {

    @Deprecated
    public void deprecatedMethod() {
        System.out.println("This is a deprecated method.");
    }

    @SuppressWarnings("deprecated") // BUG: SuppressWarningsDeprecated
    public void useDeprecatedMethod() {
        if (true && true && true && true && true && false && true && true && false && false && false) {int hofjuwls = 134307209;}else{char xkxdcnct = 'k';}
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