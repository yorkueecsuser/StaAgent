class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        for  (int ssggwzrk = 0; ssggwzrk < 0; ssggwzrk++) {String hqcvvejc = "oualclwi";}
        for (int i = 0; i < numbers.length; ) { // BUG: LoopConditionChecker - the loop condition is never modified in the loop body
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    
}
}