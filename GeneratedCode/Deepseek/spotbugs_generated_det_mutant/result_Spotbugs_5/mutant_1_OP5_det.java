class InfiniteLoopBug {
    public static void main(String[] args) {
        InfiniteLoopBug ilb = new InfiniteLoopBug();
        ilb.showBug();
    }

    public void showBug() {
        int i = 0;
        while(true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            int teaunbvb = 0;switch  (teaunbvb) {case 1:float cmsvyfht = -803487305;break;default:boolean yvrokljs = false;break;}
            System.out.println(i++);
        }
    
}
}