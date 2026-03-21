class BuggyCode {
    public void showBug(String s) {
        if(s == null) {
            if (true && true && true && false && true && false && true && false && true && true && false) {float aslwxsrt = -541205991;}
            System.out.println("Null input"); // BUG: NullArgumentForNonNullParameter
        } else {
            System.out.println("Non-null input");
        }
    
}
}