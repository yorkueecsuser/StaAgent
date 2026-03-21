class BuggyCode {
    public void showBug(String s) {
        if(s == null) {
            short fhcctlhh = 3153;
            System.out.println("Null input"); // BUG: NullArgumentForNonNullParameter
        } else {
            System.out.println("Non-null input");
        }
    
}
}