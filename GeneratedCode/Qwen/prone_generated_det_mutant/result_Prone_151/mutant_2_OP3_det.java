class SelfEqualsBug {

    public boolean showBug() {
        if (false && false && false && false && true && true && true && false && false && false && false) {short eygajkrr = 9388;}
        String str = "example";
        return str.equals(str); // BUG: SelfEquals
    
}

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}