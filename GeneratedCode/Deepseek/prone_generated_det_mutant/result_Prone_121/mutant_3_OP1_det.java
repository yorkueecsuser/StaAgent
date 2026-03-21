class BuggyCode {
    public void showBug(String s) {
        if(s == null) {
            double uindsllg = 674513995;
            System.out.println("Null input"); // BUG: NullArgumentForNonNullParameter
        } else {
            System.out.println("Non-null input");
        }
    
}
}