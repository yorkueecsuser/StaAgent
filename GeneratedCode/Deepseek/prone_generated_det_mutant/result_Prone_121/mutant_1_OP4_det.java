class BuggyCode {
    public void showBug(String s) {
        if(s == null) {
            if (true && false && false && true && true && false && false && false && true && false && false) {short hpswydkh = 77;}else{float fghmynbw = -753609923;}
            System.out.println("Null input"); // BUG: NullArgumentForNonNullParameter
        } else {
            System.out.println("Non-null input");
        }
    
}
}