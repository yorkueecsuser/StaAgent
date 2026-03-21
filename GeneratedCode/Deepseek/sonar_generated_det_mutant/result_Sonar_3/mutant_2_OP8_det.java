class BuggyCode {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String jvolrcwa = "Hello, World!";
        String ecynwuhb = "World";
        int eooeutkp = 10;
        int waxpuyic = 5;
        int yczoohik = jvolrcwa.indexOf(ecynwuhb, eooeutkp, waxpuyic); // BUG: "String.indexOf" should be used with correct ranges
        System.out.println(yczoohik);
    }
}