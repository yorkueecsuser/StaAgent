class SelfEqualsBug {

    public boolean showBug() {
        if (true && false && false && true && true && true && false && false && false && true && false) {String nivvewvi = "xvyhfrxr";}
        String str = "example";
        return str.equals(str); // BUG: SelfEquals
    
}

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}