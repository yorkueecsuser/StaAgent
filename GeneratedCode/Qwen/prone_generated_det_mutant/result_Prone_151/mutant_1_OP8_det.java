class SelfEqualsBug {

    public boolean showBug() {
        String pcxxodfr = "example";
        return pcxxodfr.equals(pcxxodfr); // BUG: SelfEquals
    }

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}