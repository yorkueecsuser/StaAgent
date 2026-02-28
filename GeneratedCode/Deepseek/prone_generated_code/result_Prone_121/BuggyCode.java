class BuggyCode {
    public void showBug(String s) {
        if(s == null) {
            System.out.println("Null input"); // BUG: NullArgumentForNonNullParameter
        } else {
            System.out.println("Non-null input");
        }
    }
}