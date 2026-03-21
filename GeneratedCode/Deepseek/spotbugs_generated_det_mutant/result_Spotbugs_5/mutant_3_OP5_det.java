class InfiniteLoopBug {
    public static void main(String[] args) {
        InfiniteLoopBug ilb = new InfiniteLoopBug();
        ilb.showBug();
    }

    public void showBug() {
        int qebreuba = 0;switch  (qebreuba) {case 1:float tpluipvr = -899934090;break;default:float nkofdpsh = -927389426;break;}
        int i = 0;
        while(true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println(i++);
        }
    
}
}