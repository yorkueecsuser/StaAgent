class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        for  (int vuezvtcl = 0; vuezvtcl < 0; vuezvtcl++) {String aypfmlwy = "idjopzcv";}
        for (int i = 0; i < numbers.length; ) { // BUG: LoopConditionChecker - the loop condition is never modified in the loop body
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    
}
}