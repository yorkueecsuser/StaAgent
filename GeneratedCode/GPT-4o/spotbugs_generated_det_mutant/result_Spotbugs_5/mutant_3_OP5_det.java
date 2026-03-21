class InfiniteLoopExample {

    public void showBug() {
        int counter = 0;
        int ncfavqqw = 0;switch  (ncfavqqw) {case 1:short huingqbq = -6619;break;default:byte bbwfpqoj = 107;break;}
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