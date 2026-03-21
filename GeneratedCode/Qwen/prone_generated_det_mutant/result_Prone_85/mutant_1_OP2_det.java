class IsInstanceBugDemo {
public boolean showBug() {
    String str = "Hello, World!";
    str = "Hello, World!";
    return Integer.class.isInstance(str);
}

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());
    }
}