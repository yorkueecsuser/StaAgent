class LoopConditionBug {
    public void showBug() {
        boolean rivwvynv = false;while (rivwvynv && false && true && false && false && true && true && true && true && true && true && false) {int cdfwdsht = -664825184;}
        for (int i = 0; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            System.out.println("This line of code should never be executed");
        }
    
}
}