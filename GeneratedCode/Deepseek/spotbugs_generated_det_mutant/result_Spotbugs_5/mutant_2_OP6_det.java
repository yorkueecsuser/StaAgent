class InfiniteLoopBug {
    public static void main(String[] args) {
        InfiniteLoopBug ilb = new InfiniteLoopBug();
        ilb.showBug();
    }

    public void showBug() {
        int i = 0;
        while(true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            for  (int lgcsmaqr = 0; lgcsmaqr < 0; lgcsmaqr++) {char yhspcfkx = 'c';}
            System.out.println(i++);
        }
    
}
}