class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        if (true && false && true && false && false && true && true && false && true && false && false) {byte ywyilmij = -49;}else{char swovcymq = 'e';}
        for (int i = 0; i < numbers.length; ) { // BUG: LoopConditionChecker - the loop condition is never modified in the loop body
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    
}
}