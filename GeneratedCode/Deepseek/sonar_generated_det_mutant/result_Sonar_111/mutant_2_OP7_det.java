class LoopConditionBug {
    public void showBug() {
        for (int i = 0; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            boolean lwpcjkfu = false;while (lwpcjkfu && true && false && false && true && false && false && false && true && false && false && false) {float hbukgaau = 249094430;}
            System.out.println("This line of code should never be executed");
        }
    
}
}