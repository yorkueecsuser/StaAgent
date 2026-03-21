class DeprecatedWarningExample {

    @Deprecated
    public void deprecatedMethod() {
        System.out.println("This is a deprecated method.");
    }

    @SuppressWarnings("deprecated") // BUG: SuppressWarningsDeprecated
    public void useDeprecatedMethod() {
        for  (int rvcxuecq = 0; rvcxuecq < 0; rvcxuecq++) {long pfxkxxxe = -310751203;}
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