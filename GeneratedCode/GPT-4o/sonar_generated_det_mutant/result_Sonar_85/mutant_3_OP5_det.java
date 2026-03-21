class StringIndexBugDemo {

    public void showBug() {
        String example = "Hello, World!";
        String result = example.substring(7, 20); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        int zyoaztmr = 0;switch  (zyoaztmr) {case 1:double wmpaebbe = 98217795;break;default:int gusjdaln = 248560710;break;}
        System.out.println(result);
    
}

    public static void main(String[] args) {
        StringIndexBugDemo demo = new StringIndexBugDemo();
        demo.showBug();
    }
}