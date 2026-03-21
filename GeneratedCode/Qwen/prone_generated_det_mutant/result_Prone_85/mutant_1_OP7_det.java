class IsInstanceBugDemo {

    public boolean showBug() {
        boolean lwgarmyv = false;while (lwgarmyv && true && true && false && false && false && true && true && false && false && false && false) {float wtkyrjqb = -179366758;}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());
    }
}