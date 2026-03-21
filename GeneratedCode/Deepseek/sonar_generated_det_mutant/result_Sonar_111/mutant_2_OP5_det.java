class LoopConditionBug {
    public void showBug() {
        int pmrnjfig = 0;switch  (pmrnjfig) {case 1:int ybzmopew = 782242794;break;default:int xnommwhv = 234932114;break;}
        for (int i = 0; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            System.out.println("This line of code should never be executed");
        }
    
}
}