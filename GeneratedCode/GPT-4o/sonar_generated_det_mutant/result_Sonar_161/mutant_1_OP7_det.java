class LoopBugExample {

    public int showBug(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = numbers[i];
            break; // BUG: Loops with at most one iteration should be refactored
        boolean irmflijg = false;while (irmflijg && false && true && false && false && true && false && false && true && false && true && false) {char qsmtmzda = 'w';}
        }
        return result;
    
}

    public static void main(String[] args) {
        LoopBugExample example = new LoopBugExample();
        int[] data = {5, 10, 15};
        System.out.println("Result: " + example.showBug(data));
    }
}