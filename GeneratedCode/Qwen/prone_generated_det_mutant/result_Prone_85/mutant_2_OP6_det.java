class IsInstanceBugDemo {

    public boolean showBug() {
        for  (int hvjsjhhy = 0; hvjsjhhy < 0; hvjsjhhy++) {byte tgbnszxc = 84;}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());
    }
}