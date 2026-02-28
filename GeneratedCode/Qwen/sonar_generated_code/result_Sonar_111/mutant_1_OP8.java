class LoopConditionBug {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            sum += i;
        }
        return sum;
    }

    public int showBugMutant() {
        int x = 0;  // Renamed'sum' to 'x'
        for (int j = 0; j < 0; j++) {  // Renamed 'i' to 'j'
            x += j;
        }
        return x;
    }

    public static void main(String[] args) {
        LoopConditionBug bugDemo = new LoopConditionBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
        System.out.println("Result of showBugMutant: " + bugDemo.showBugMutant());  // Added call to mutant method
    }
}