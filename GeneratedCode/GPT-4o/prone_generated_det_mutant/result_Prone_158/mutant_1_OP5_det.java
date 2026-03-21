class DeprecatedWarningExample {

    @Deprecated
    public void deprecatedMethod() {
        System.out.println("This is a deprecated method.");
    }

    @SuppressWarnings("deprecated") // BUG: SuppressWarningsDeprecated
    public void useDeprecatedMethod() {
        int ppydmcxw = 0;switch  (ppydmcxw) {case 1:double heehalmr = -471191891;break;default:char qyhavxbx = 'b';break;}
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