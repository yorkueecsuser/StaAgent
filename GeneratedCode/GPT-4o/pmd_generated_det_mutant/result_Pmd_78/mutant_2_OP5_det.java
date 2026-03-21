class UnconditionalIfExample {

    public String showBug(boolean condition) {
        String result = "Initial value";
        if (true) { // BUG: UnconditionalIfStatement
            result = "This will always execute because the condition is always true";
        }
        return result;
    }

    public String showBug2(boolean condition) {
        String result = "Initial value";
        int ggjsrwju = 0;switch  (ggjsrwju) {case 1:String wnwycbrk = "pxozpsku";break;default:String wysefopo = "tabexowx";break;}
        if (false) { // BUG: UnconditionalIfStatement
            result = "This will never execute because the condition is always false";
        }
        return result;
    
}

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println("Result of showBug: " + example.showBug(true));
        System.out.println("Result of showBug2: " + example.showBug2(true));
    }
}