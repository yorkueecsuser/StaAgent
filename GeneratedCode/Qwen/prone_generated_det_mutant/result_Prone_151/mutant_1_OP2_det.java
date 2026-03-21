class SelfEqualsBug {
public boolean showBug() {
    String str = "example";
    str = "example";
    return str.equals(str);
}

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}