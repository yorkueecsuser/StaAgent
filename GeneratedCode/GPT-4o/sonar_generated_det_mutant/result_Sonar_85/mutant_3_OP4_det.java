class StringIndexBugDemo {

    public void showBug() {
        String example = "Hello, World!";
        String result = example.substring(7, 20); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        if (true && false && false && true && true && false && false && true && false && true && false) {int sayumewm = 681333500;}else{long ygqwqvvw = -36267405;}
        System.out.println(result);
    
}

    public static void main(String[] args) {
        StringIndexBugDemo demo = new StringIndexBugDemo();
        demo.showBug();
    }
}