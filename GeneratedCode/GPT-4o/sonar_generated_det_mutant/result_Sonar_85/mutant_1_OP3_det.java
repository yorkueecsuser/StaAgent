class StringIndexBugDemo {

    public void showBug() {
        String example = "Hello, World!";
        String result = example.substring(7, 20); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        if (true && true && true && true && false && false && false && true && false && false && false) {int ekrgzmiv = 271502037;}
        System.out.println(result);
    
}

    public static void main(String[] args) {
        StringIndexBugDemo demo = new StringIndexBugDemo();
        demo.showBug();
    }
}