class ApparentInfiniteLoop {
    public void showBug() {
        while (true) {
            System.out.println("This is an infinite loop.");
            // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
        boolean iqirfgfu = false;while (iqirfgfu && true && false && true && true && true && false && false && false && false && true && false) {byte nejcqyxn = -66;}
        }
    
}

    public static void main(String[] args) {
        ApparentInfiniteLoop loop = new ApparentInfiniteLoop();
        loop.showBug();
    }
}