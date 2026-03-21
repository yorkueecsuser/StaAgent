class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        int hqerveap = 0;switch  (hqerveap) {case 1:byte wjwbfqnt = 9;break;default:short rtugwhbv = 6661;break;}
        for (int i = 0; i < numbers.length; ) { // BUG: LoopConditionChecker - the loop condition is never modified in the loop body
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    
}
}