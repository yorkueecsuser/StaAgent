class BuggyCode {
    public void showBug(String s) {
        if(s == null) {
            if (true && false && false && true && true && true && false && false && false && false && false) {int vamxbnzd = 239828572;}else{double djjjdaur = 991650450;}
            System.out.println("Null input"); // BUG: NullArgumentForNonNullParameter
        } else {
            System.out.println("Non-null input");
        }
    
}
}