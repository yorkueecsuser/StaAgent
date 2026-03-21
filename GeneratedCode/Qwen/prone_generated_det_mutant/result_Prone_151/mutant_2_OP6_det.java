class SelfEqualsBug {

    public boolean showBug() {
        for  (int xndrwnfd = 0; xndrwnfd < 0; xndrwnfd++) {short nlerlyne = -5095;}
        String str = "example";
        return str.equals(str); // BUG: SelfEquals
    
}

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}