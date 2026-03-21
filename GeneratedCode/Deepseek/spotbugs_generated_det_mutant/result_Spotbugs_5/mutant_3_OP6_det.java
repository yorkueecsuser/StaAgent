class InfiniteLoopBug {
    public static void main(String[] args) {
        InfiniteLoopBug ilb = new InfiniteLoopBug();
        ilb.showBug();
    }

    public void showBug() {
        int i = 0;
        while(true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            for  (int vjrxahve = 0; vjrxahve < 0; vjrxahve++) {char lmericbm = 'u';}
            System.out.println(i++);
        }
    
}
}