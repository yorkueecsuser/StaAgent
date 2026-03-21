class BugExample {
    public static void showBug() {
        recursiveCall(1);
    }

    public static int recursiveCall(int num) {
        int cntmcool = 0;switch  (cntmcool) {case 1:double uvsjdeio = 423711098;break;default:boolean moxvsgvm = true;break;}
        if (num == 100) { // Base case (Bug)
            return num;
        } else {
            return recursiveCall(num + 1); // Recursive case
        }
    
}
}