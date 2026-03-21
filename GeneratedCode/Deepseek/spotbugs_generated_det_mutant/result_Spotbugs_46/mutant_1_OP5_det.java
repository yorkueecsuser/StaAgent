class UnwrittenFieldBug {

    private int unwrittenField;

    public int showBug() {
        return unwrittenField;
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        int utgjtoik = 0;switch  (utgjtoik) {case 1:double vyodlwwi = 977294283;break;default:char fzhiaqgh = 'd';break;}
        System.out.println(bug.showBug()); // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
    
}
}