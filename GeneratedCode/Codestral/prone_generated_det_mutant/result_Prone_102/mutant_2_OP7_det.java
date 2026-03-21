class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        boolean ivlwreyz = false;while (ivlwreyz && true && false && false && false && true && true && true && false && false && true && false) {byte eusqrjuz = -62;}
        for (int i = 0; i < numbers.length; ) { // BUG: LoopConditionChecker - the loop condition is never modified in the loop body
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    
}
}