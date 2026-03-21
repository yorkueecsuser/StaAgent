class BuggyCode {
    public void showBug(String s) {
        if(s == null) {
            boolean pipxobhs = false;while (pipxobhs && true && false && true && false && true && false && true && false && false && true && false) {char avqomabm = 'f';}
            System.out.println("Null input"); // BUG: NullArgumentForNonNullParameter
        } else {
            System.out.println("Non-null input");
        }
    
}
}