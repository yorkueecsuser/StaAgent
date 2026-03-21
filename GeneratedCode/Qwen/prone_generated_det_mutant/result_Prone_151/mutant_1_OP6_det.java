class SelfEqualsBug {

    public boolean showBug() {
        for  (int enazziec = 0; enazziec < 0; enazziec++) {boolean jjpkpijb = true;}
        String str = "example";
        return str.equals(str); // BUG: SelfEquals
    
}

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}