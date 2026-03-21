class StringIndexBugDemo {
public void showBug() {
    String example = "Hello, World!";
    example = "Hello, World!";
    String result = example.substring(7 , 20);
    System.out.println(result);
}

    public static void main(String[] args) {
        StringIndexBugDemo demo = new StringIndexBugDemo();
        demo.showBug();
    }
}