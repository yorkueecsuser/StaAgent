class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        int mmhnbjsv = 0;switch  (mmhnbjsv) {case 1:char tpauldys = 'q';break;default:byte rtwezggt = -50;break;}
        int n = s.length(); // BUG: DereferenceWithNullBranch
        return n;
    
}
}