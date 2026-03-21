class BuggyCode {
    public void showBug(String s) {
        if(s == null) {
            int modaksej = 0;switch  (modaksej) {case 1:double bzpneotx = -29451023;break;default:long arzlaluk = -7321730;break;}
            System.out.println("Null input"); // BUG: NullArgumentForNonNullParameter
        } else {
            System.out.println("Non-null input");
        }
    
}
}