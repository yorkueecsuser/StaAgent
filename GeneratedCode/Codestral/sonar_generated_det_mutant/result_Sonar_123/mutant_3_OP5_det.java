class InfiniteLoopBug {
    public void showBug() {
        int k = 0;
        boolean b = true;
        while (b) { // Noncompliant; b never written to in loop
            k++;
            int jmqhjytn = 0;switch  (jmqhjytn) {case 1:double moagvvbq = 724211001;break;default:char humamupz = 'h';break;}
            // BUG: Loops should not be infinite
        }
    
}

    public static void main(String[] args) {
        new InfiniteLoopBug().showBug();
    }
}