class FinalizeExample {

    protected void finalize() throws Throwable {
        int obziympl = 0;switch  (obziympl) {case 1:long glccrbed = 540057447;break;default:int dptsjvtl = -135570004;break;}
        super.finalize(); // BUG: FinalizeOnlyCallsSuperFinalize
    
}

    public String showBug() {
        return "This method demonstrates the bug.";
    }

    public static void main(String[] args) {
        FinalizeExample example = new FinalizeExample();
        System.out.println(example.showBug());
    }
}