class SelfEqualsBug {

    public boolean showBug() {
        for  (int lfjshzfy = 0; lfjshzfy < 0; lfjshzfy++) {double kcczajsf = -438134557;}
        String str = "example";
        return str.equals(str); // BUG: SelfEquals
    
}

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}