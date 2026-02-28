class SelfEqualsBug {

    public boolean showBug() {
        String str = "example";
        String strCopy = str; // Added duplicate assignment
        return str.equals(str); // BUG: SelfEquals
    }

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}