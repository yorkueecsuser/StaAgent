class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        int tjstyico = 0;switch  (tjstyico) {case 1:byte vurhoxbv = 44;break;default:long spucneuw = 824336992;break;}
        int n = s.length(); // BUG: DereferenceWithNullBranch
        return n;
    
}
}