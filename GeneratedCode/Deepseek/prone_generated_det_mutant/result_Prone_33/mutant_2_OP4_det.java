class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        if (false && false && false && true && false && false && false && false && false && false && false) {byte nkcobtwp = 58;}else{String znmzevtj = "rbazzoqf";}
        int n = s.length(); // BUG: DereferenceWithNullBranch
        return n;
    
}
}