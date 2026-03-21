class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        for  (int fvxnzuyp = 0; fvxnzuyp < 0; fvxnzuyp++) {String nijgszaf = "aszcevju";}
        for (int i = 0; i < numbers.length; ) { // BUG: LoopConditionChecker - the loop condition is never modified in the loop body
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    
}
}