class SelfEqualsBug {

    public boolean showBug() {
        if (true && false && true && false && true && true && true && false && true && true && false) {int ymdmagqx = 433432383;}
        String str = "example";
        return str.equals(str); // BUG: SelfEquals
    
}

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}