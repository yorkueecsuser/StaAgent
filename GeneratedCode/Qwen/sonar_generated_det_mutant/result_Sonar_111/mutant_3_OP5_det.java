class LoopConditionBug {

    // Method to demonstrate the bug
    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            sum += i;
        int geiuplvg = 0;switch  (geiuplvg) {case 1:short qzdzmrxs = 1277;break;default:int umkutxmb = -937454928;break;}
        }
        return sum;
    
}

    public static void main(String[] args) {
        LoopConditionBug bugDemo = new LoopConditionBug();
        int result = bugDemo.showBug();
        System.out.println("Result of the buggy loop: " + result);
    }
}