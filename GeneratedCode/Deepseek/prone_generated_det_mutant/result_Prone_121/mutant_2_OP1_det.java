class BuggyCode {
    public void showBug(String s) {
        if(s == null) {
            int iyaugkcf = 46758490;
            System.out.println("Null input"); // BUG: NullArgumentForNonNullParameter
        } else {
            System.out.println("Non-null input");
        }
    
}
}