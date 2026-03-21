class SelfEqualsBug {

    public boolean showBug() {
        if (true && false && false && true && false && true && true && false && false && true && false) {long qfmmytxl = -513636024;}else{double pzdhdtol = 411557341;}
        String str = "example";
        return str.equals(str); // BUG: SelfEquals
    
}

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}