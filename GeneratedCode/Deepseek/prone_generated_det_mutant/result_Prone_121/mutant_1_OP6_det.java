class BuggyCode {
    public void showBug(String s) {
        if(s == null) {
            for  (int ycvhvuxy = 0; ycvhvuxy < 0; ycvhvuxy++) {float pefveyjq = -56023136;}
            System.out.println("Null input"); // BUG: NullArgumentForNonNullParameter
        } else {
            System.out.println("Non-null input");
        }
    
}
}