class InfiniteLoopExample {

    public void showBug() {
        int a = 0; // Renamed from 'counter' to 'a'
        int counter = 0; // Original code
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