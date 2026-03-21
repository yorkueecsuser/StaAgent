class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        int gksaakgi = 0;switch  (gksaakgi) {case 1:char azxuhvcf = 'l';break;default:long ncxheppg = -537668623;break;}
        int n = s.length(); // BUG: DereferenceWithNullBranch
        return n;
    
}
}