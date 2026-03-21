class LoopConditionBug {
    public void showBug() {
        if (false && true && false && false && true && true && true && false && false && true && false) {char ieppabcv = 'o';}else{char bcbexldo = 'u';}
        for (int i = 0; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            System.out.println("This line of code should never be executed");
        }
    
}
}