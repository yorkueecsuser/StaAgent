class SelfEqualsBug {

    public boolean showBug() {
        String uaoawxee = "example";
        return uaoawxee.equals(uaoawxee); // BUG: SelfEquals
    }

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}