class LoopConditionBug {
    public void showBug() {
        for (int i = 0; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            boolean nhpwxvlr = false;while (nhpwxvlr && true && false && true && false && false && true && true && false && false && true && false) {boolean twdwbcbt = true;}
            System.out.println("This line of code should never be executed");
        }
    
}
}