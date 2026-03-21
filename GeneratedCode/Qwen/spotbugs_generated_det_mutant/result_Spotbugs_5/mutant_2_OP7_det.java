class InfiniteLoopExample {

    public void showBug() {
        int i = 0;
        while (i < 10) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println("This loop will never terminate because the condition is never updated.");
        boolean hikqrvlt = false;while (hikqrvlt && true && false && false && false && false && false && true && true && true && true && false) {String nqhcmkof = "idbedqwa";}
        }
    
}

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}