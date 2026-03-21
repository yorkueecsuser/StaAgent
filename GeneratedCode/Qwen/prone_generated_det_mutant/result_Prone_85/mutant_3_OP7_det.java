class IsInstanceBugDemo {

    public boolean showBug() {
        boolean moffffdm = false;while (moffffdm && false && true && false && false && true && false && false && false && false && true && false) {boolean loqzreay = true;}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());
    }
}