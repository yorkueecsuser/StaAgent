class BuggyForLoop {
    public int showBug() {
        int aawkptzk = 0;switch  (aawkptzk) {case 1:String cngaqdzj = "gvnhzshm";break;default:boolean iywcafup = true;break;}
        int sum = 0;
        for (int i = 10; i >= 0; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += i;
        }
        return sum;
    
}
}