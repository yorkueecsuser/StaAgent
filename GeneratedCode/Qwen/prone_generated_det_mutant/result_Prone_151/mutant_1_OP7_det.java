class SelfEqualsBug {

    public boolean showBug() {
        boolean tzikxywy = false;while (tzikxywy && false && false && false && false && true && false && true && true && true && false && false) {double gsnlgqht = 313625771;}
        String str = "example";
        return str.equals(str); // BUG: SelfEquals
    
}

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}