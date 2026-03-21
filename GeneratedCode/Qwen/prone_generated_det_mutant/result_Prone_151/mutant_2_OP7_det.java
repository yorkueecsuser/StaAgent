class SelfEqualsBug {

    public boolean showBug() {
        boolean pbdkashy = false;while (pbdkashy && true && true && false && false && true && true && true && true && false && true && false) {short zfofnbhy = -2838;}
        String str = "example";
        return str.equals(str); // BUG: SelfEquals
    
}

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}