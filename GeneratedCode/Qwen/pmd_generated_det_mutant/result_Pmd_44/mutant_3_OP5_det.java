class FinalizeExample {

    protected void finalize() throws Throwable {
        int apsjqzka = 0;switch  (apsjqzka) {case 1:float maonbgig = 235291164;break;default:boolean nrmzauop = true;break;}
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