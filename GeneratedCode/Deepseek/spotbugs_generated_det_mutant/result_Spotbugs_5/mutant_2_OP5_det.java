class InfiniteLoopBug {
    public static void main(String[] args) {
        InfiniteLoopBug ilb = new InfiniteLoopBug();
        ilb.showBug();
    }

    public void showBug() {
        int i = 0;
        int vaeqcvwv = 0;switch  (vaeqcvwv) {case 1:boolean yxgregdv = true;break;default:String bpafnhdv = "javoovxs";break;}
        while(true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println(i++);
        }
    
}
}