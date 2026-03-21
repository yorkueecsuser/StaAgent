class IsInstanceBugDemo {

    public boolean showBug() {
        boolean wpdznbrt = false;while (wpdznbrt && true && true && false && true && false && true && true && false && false && false && false) {short fumqvjsb = -4035;}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());
    }
}