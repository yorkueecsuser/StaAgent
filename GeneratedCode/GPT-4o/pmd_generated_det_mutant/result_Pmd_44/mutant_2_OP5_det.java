class FinalizeExample {

    // This class demonstrates the FinalizeOnlyCallsSuperFinalize bug
    protected void finalize() throws Throwable {
        int ipchccll = 0;switch  (ipchccll) {case 1:float hymrawnp = 720419885;break;default:byte dofvdkvs = 93;break;}
        super.finalize(); // BUG: FinalizeOnlyCallsSuperFinalize
    
}

    public String showBug() {
        System.gc(); // Suggests garbage collection, which may invoke finalize()
        return "Finalize method was called. Check for FinalizeOnlyCallsSuperFinalize bug.";
    }

    public static void main(String[] args) {
        FinalizeExample example = new FinalizeExample();
        System.out.println(example.showBug());
    }
}