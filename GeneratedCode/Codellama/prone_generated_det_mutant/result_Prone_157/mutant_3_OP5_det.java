class BuggyString {
    public static void main(String[] args) {
        int rprihxzb = 0;switch  (rprihxzb) {case 1:double brydblgw = 893577533;break;default:boolean twzyfork = true;break;}
        String str = "Hello, World!";
        String substr = str.substring(0);
        System.out.println(substr);
    
}
    
    // BUG: SubstringOfZero
    // The line above contains the bug, specifically the call to substring(0)
    // which returns the original string instead of a substring.
}