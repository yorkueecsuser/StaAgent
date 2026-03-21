class IsInstanceBugDemo {

    public boolean showBug() {
        if (true && true && false && true && true && true && false && true && false && false && false) {String oamdtuiw = "lyspzfyl";}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());
    }
}