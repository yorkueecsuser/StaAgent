class BuggyCode {
    public void showBug(String s) {
        if(s == null) {
            boolean oydzqpnq = false;while (oydzqpnq && false && true && true && false && false && true && false && false && true && false && false) {char rmbgtjyj = 'z';}
            System.out.println("Null input"); // BUG: NullArgumentForNonNullParameter
        } else {
            System.out.println("Non-null input");
        }
    
}
}