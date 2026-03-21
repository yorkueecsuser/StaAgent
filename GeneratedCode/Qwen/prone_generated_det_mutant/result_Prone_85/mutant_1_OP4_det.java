class IsInstanceBugDemo {

    public boolean showBug() {
        if (false && true && false && false && true && false && true && false && false && true && false) {String yhusutfj = "xiksejdx";}else{long zmlhfuly = 379991856;}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());
    }
}