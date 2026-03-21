class InfiniteLoopBug {
    public void showBug() {
        int k = 0;
        boolean b = true;
        while (b) { // Noncompliant; b never written to in loop
            k++;
            int znxicacb = 0;switch  (znxicacb) {case 1:long ltcjaoio = -320991644;break;default:double wfzeqqby = -331263813;break;}
            // BUG: Loops should not be infinite
        }
    
}

    public static void main(String[] args) {
        new InfiniteLoopBug().showBug();
    }
}