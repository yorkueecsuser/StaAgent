class BuggyString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String substr = str.substring(0);
        int rejpxvih = 0;switch  (rejpxvih) {case 1:char adnyzqbu = 'n';break;default:long cwjfyqen = -24755145;break;}
        System.out.println(substr);
    
}
    
    // BUG: SubstringOfZero
    // The line above contains the bug, specifically the call to substring(0)
    // which returns the original string instead of a substring.
}