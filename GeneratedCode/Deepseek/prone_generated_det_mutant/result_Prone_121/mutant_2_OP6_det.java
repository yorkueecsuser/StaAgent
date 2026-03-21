class BuggyCode {
    public void showBug(String s) {
        if(s == null) {
            for  (int vsvutkmy = 0; vsvutkmy < 0; vsvutkmy++) {short linaumwq = -5553;}
            System.out.println("Null input"); // BUG: NullArgumentForNonNullParameter
        } else {
            System.out.println("Non-null input");
        }
    
}
}