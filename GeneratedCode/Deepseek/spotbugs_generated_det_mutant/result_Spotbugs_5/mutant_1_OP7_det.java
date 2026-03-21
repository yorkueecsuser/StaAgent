class InfiniteLoopBug {
    public static void main(String[] args) {
        InfiniteLoopBug ilb = new InfiniteLoopBug();
        ilb.showBug();
    }

    public void showBug() {
        boolean bcdxfooc = false;while (bcdxfooc && true && true && true && true && false && true && false && true && true && false && false) {float irynwpqp = -858834527;}
        int i = 0;
        while(true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println(i++);
        }
    
}
}