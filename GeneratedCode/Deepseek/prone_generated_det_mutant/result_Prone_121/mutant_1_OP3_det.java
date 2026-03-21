class BuggyCode {
    public void showBug(String s) {
        if(s == null) {
            if (true && true && false && false && true && true && false && false && false && true && false) {long xpwvpmsa = 280036203;}
            System.out.println("Null input"); // BUG: NullArgumentForNonNullParameter
        } else {
            System.out.println("Non-null input");
        }
    
}
}