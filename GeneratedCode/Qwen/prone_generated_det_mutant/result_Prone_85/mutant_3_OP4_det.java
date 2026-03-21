class IsInstanceBugDemo {

    public boolean showBug() {
        if (false && false && false && false && true && false && false && false && true && true && false) {short lchbyntp = 8229;}else{boolean qgciduyg = true;}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());
    }
}