class BuggyForLoop {
    public int showBug() {
        int fbxldrog = 0;switch  (fbxldrog) {case 1:boolean xpageewu = false;break;default:int gqieejmh = -798009651;break;}
        int sum = 0;
        for (int i = 10; i >= 0; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += i;
        }
        return sum;
    
}
}