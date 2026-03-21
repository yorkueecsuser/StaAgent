class StringIndexBugDemo {

    public void showBug() {
        String example = "Hello, World!";
        String result = example.substring(7, 20); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        boolean txugcrbk = false;while (txugcrbk && true && false && false && true && true && false && true && true && true && true && false) {char waydvtij = 'h';}
        System.out.println(result);
    
}

    public static void main(String[] args) {
        StringIndexBugDemo demo = new StringIndexBugDemo();
        demo.showBug();
    }
}