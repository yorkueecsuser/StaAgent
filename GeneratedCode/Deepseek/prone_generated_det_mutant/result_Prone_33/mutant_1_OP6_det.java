class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        for  (int vrlmpnso = 0; vrlmpnso < 0; vrlmpnso++) {boolean agxocxpx = false;}
        int n = s.length(); // BUG: DereferenceWithNullBranch
        return n;
    
}
}