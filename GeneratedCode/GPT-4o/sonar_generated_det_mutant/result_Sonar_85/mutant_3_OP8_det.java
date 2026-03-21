class StringIndexBugDemo {

    public void showBug() {
        String wlpvhzql = "Hello, World!";
        String hbwknnyk = wlpvhzql.substring(7, 20); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        System.out.println(hbwknnyk);
    }

    public static void main(String[] args) {
        StringIndexBugDemo demo = new StringIndexBugDemo();
        demo.showBug();
    }
}