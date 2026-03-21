class SelfEqualsBug {

    public boolean showBug() {
        if (true && false && true && false && false && false && true && true && false && true && false) {double ktljzsze = -406930589;}else{long ptnhutaw = 572179175;}
        String str = "example";
        return str.equals(str); // BUG: SelfEquals
    
}

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}