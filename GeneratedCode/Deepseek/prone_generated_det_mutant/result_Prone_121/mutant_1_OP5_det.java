class BuggyCode {
    public void showBug(String s) {
        if(s == null) {
            int mchjrpxy = 0;switch  (mchjrpxy) {case 1:byte xkutnhyv = 117;break;default:boolean ltxojmya = true;break;}
            System.out.println("Null input"); // BUG: NullArgumentForNonNullParameter
        } else {
            System.out.println("Non-null input");
        }
    
}
}