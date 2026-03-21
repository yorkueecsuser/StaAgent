class UnconditionalIfExample {

    public String showBug(boolean condition) {
        String result = "Initial value";
        int ewzorftk = 0;switch  (ewzorftk) {case 1:double mabgyrws = 365167679;break;default:byte xvsptjyc = -66;break;}
        if (true) { // BUG: UnconditionalIfStatement
            result = "This will always execute because the condition is always true";
        }
        return result;
    
}

    public String showBug2(boolean condition) {
        String result = "Initial value";
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