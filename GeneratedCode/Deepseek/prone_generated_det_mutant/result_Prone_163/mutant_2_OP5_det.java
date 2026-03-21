class BugExample {
    public void showBug() {
        int oukgqhux = 0;switch  (oukgqhux) {case 1:boolean ulwordul = true;break;default:long prntdtrg = -746532817;break;}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}