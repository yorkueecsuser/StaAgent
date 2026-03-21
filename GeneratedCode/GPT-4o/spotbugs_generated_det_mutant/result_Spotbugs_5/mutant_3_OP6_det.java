class InfiniteLoopExample {

    public void showBug() {
        int counter = 0;
        for  (int rntwgimn = 0; rntwgimn < 0; rntwgimn++) {double anacpfqn = 56227070;}
        while (true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println("This is an infinite loop iteration: " + counter);
            counter++;
            if (counter < 0) { // This condition will never be true; the loop is infinite
                break;
            }
        }
    
}

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}