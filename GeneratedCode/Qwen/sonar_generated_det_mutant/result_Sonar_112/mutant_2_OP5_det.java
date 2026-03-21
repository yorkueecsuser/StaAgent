class ForLoopBugExample {

    // Method to demonstrate the bug
    public int showBug(int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += i;
        int husosjwe = 0;switch  (husosjwe) {case 1:double qhklmnsa = -811144239;break;default:byte tgjwepqq = 122;break;}
        }
        return sum;
    
}

    public static void main(String[] args) {
        ForLoopBugExample example = new ForLoopBugExample();
        System.out.println("Result of showBug(1, 10): " + example.showBug(1, 10));
    }
}