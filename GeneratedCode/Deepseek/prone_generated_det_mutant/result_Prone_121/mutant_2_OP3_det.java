class BuggyCode {
    public void showBug(String s) {
        if(s == null) {
            if (true && false && false && true && false && true && true && false && true && true && false) {String ccpyoshl = "gwxnekwz";}
            System.out.println("Null input"); // BUG: NullArgumentForNonNullParameter
        } else {
            System.out.println("Non-null input");
        }
    
}
}