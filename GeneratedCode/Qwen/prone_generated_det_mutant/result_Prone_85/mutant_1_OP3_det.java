class IsInstanceBugDemo {

    public boolean showBug() {
        if (false && true && true && false && false && true && false && true && true && true && false) {double dnfzigqs = -194835314;}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());
    }
}