class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        if (false && false && false && false && false && false && false && false && false && true && false) {double srpsbytv = -286047691;}else{byte rexvlwmy = -63;}
        for (int i = 0; i < numbers.length; ) { // BUG: LoopConditionChecker - the loop condition is never modified in the loop body
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    
}
}