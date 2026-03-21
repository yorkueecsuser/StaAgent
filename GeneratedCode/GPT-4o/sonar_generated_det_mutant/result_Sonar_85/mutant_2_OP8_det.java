class StringIndexBugDemo {

    public void showBug() {
        String cgsziemv = "Hello, World!";
        String iyvvosgy = cgsziemv.substring(7, 20); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        System.out.println(iyvvosgy);
    }

    public static void main(String[] args) {
        StringIndexBugDemo demo = new StringIndexBugDemo();
        demo.showBug();
    }
}