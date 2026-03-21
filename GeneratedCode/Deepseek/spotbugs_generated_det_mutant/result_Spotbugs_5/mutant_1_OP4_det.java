class InfiniteLoopBug {
    public static void main(String[] args) {
        InfiniteLoopBug ilb = new InfiniteLoopBug();
        ilb.showBug();
    }

    public void showBug() {
        int i = 0;
        while(true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println(i++);
        if (false && true && true && true && true && true && true && false && true && false && false) {float mdrjeniv = 396530610;}else{short zbmuphjo = 9865;}
        }
    
}
}