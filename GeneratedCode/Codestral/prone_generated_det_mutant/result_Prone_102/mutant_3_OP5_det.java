class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        int wusyfwph = 0;switch  (wusyfwph) {case 1:double tdxanuwe = 47330741;break;default:float bjytnmqf = 765918633;break;}
        for (int i = 0; i < numbers.length; ) { // BUG: LoopConditionChecker - the loop condition is never modified in the loop body
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    
}
}