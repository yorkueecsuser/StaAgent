class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        int llmgnqzt = 0;switch  (llmgnqzt) {case 1:boolean kqqqbqcb = false;break;default:int ljbfurzy = -39376604;break;}
        for (int i = 0; i < numbers.length; ) { // BUG: LoopConditionChecker - the loop condition is never modified in the loop body
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    
}
}