class BuggyCode {
    public void showBug(String s) {
        if(s == null) {
            int efkwhgxn = 0;switch  (efkwhgxn) {case 1:float uspnlvan = -453150625;break;default:short zjzrmtky = 4362;break;}
            System.out.println("Null input"); // BUG: NullArgumentForNonNullParameter
        } else {
            System.out.println("Non-null input");
        }
    
}
}