class StringIndexBugDemo {

    public void showBug() {
        String adtkhdis = "Hello, World!";
        String zuspwsnt = adtkhdis.substring(7, 20); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        System.out.println(zuspwsnt);
    }

    public static void main(String[] args) {
        StringIndexBugDemo demo = new StringIndexBugDemo();
        demo.showBug();
    }
}