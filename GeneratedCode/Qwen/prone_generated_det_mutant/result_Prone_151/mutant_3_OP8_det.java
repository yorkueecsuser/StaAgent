class SelfEqualsBug {

    public boolean showBug() {
        String gbxjzvdr = "example";
        return gbxjzvdr.equals(gbxjzvdr); // BUG: SelfEquals
    }

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}