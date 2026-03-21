class InfiniteLoopExample {

    public void showBug() {
        int wusbuzyp = 0;
        while (true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println("This is an infinite loop iteration: " + wusbuzyp);
            wusbuzyp++;
            if (wusbuzyp < 0) { // This condition will never be true; the loop is infinite
                break;
            }
        }
    }

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}