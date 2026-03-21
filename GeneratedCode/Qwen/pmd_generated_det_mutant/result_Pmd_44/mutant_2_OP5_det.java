class FinalizeExample {

    protected void finalize() throws Throwable {
        int sbhhfkvq = 0;switch  (sbhhfkvq) {case 1:short xzolxcby = -6649;break;default:int csybwbow = -50974029;break;}
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