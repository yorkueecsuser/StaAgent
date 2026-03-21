class IsInstanceBugDemo {

    public boolean showBug() {
        if (true && false && true && false && false && true && true && true && true && false && false) {float sfbjuohh = -71295589;}else{char xbzgdzbt = 'f';}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());
    }
}