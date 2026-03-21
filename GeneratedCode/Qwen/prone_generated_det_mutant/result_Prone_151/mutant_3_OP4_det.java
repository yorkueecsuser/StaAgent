class SelfEqualsBug {

    public boolean showBug() {
        if (false && true && true && false && true && true && false && false && true && true && false) {boolean hjwapxir = false;}else{char ztifeshk = 'm';}
        String str = "example";
        return str.equals(str); // BUG: SelfEquals
    
}

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}