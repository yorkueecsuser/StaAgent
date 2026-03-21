class LoopConditionBug {
    public void showBug() {
        for  (int zdbzvlto = 0; zdbzvlto < 0; zdbzvlto++) {boolean xylaqmnw = false;}
        for (int i = 0; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            System.out.println("This line of code should never be executed");
        }
    
}
}