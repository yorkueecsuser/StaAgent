class BuggyCode {
    public void showBug(String s) {
        if(s == null) {
            for  (int uxwbjfrp = 0; uxwbjfrp < 0; uxwbjfrp++) {long eqoswcvz = -791765259;}
            System.out.println("Null input"); // BUG: NullArgumentForNonNullParameter
        } else {
            System.out.println("Non-null input");
        }
    
}
}