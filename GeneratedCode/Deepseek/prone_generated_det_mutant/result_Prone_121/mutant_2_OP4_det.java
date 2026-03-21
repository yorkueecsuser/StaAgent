class BuggyCode {
    public void showBug(String s) {
        if(s == null) {
            if (false && false && false && true && false && false && false && false && true && false && false) {int ygescwsl = -890873804;}else{short sazbkjey = -3640;}
            System.out.println("Null input"); // BUG: NullArgumentForNonNullParameter
        } else {
            System.out.println("Non-null input");
        }
    
}
}