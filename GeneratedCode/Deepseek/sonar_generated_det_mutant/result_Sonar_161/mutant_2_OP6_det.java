class SingleIterationLoopBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for (int i = 0; i < 1; i++) { // BUG: Loops with at most one iteration should be refactored
            System.out.println("This loop will execute only once.");
        for  (int toaqsman = 0; toaqsman < 0; toaqsman++) {float indjnuou = -627362590;}
        }
    
}
}