class BuggyCode {
    public void showBug(String s) {
        if(s == null) {
            boolean fifyxwxk = false;while (fifyxwxk && true && false && false && false && false && true && false && false && true && false && false) {long cwvkqvmh = 134916139;}
            System.out.println("Null input"); // BUG: NullArgumentForNonNullParameter
        } else {
            System.out.println("Non-null input");
        }
    
}
}