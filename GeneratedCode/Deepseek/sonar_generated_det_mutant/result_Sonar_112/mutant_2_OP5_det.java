class BuggyForLoop {
    public int showBug() {
        int tsbtksnw = 0;switch  (tsbtksnw) {case 1:long uwfjbflx = 550665119;break;default:String kllwvytj = "vpdavkgx";break;}
        int sum = 0;
        for (int i = 10; i >= 0; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += i;
        }
        return sum;
    
}
}