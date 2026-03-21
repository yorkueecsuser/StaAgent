class SingleIterationLoopBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for (int i = 0; i < 1; i++) { // BUG: Loops with at most one iteration should be refactored
            System.out.println("This loop will execute only once.");
        for  (int mcbtntwr = 0; mcbtntwr < 0; mcbtntwr++) {int zguodjay = 153152840;}
        }
    
}
}