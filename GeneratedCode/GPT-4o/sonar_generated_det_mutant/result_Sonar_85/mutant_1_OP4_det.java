class StringIndexBugDemo {

    public void showBug() {
        String example = "Hello, World!";
        String result = example.substring(7, 20); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        if (false && false && true && false && true && true && true && true && false && true && false) {int bglziyua = 579236519;}else{boolean xzuyoswz = false;}
        System.out.println(result);
    
}

    public static void main(String[] args) {
        StringIndexBugDemo demo = new StringIndexBugDemo();
        demo.showBug();
    }
}