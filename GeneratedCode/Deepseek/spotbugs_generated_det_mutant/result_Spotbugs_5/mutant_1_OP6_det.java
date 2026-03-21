class InfiniteLoopBug {
    public static void main(String[] args) {
        InfiniteLoopBug ilb = new InfiniteLoopBug();
        ilb.showBug();
    }

    public void showBug() {
        int i = 0;
        for  (int vguwqhlq = 0; vguwqhlq < 0; vguwqhlq++) {float piztrmik = 414019906;}
        while(true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println(i++);
        }
    
}
}