class BugExample {
    public static void showBug() {
        recursiveCall(1);
    }

    public static int recursiveCall(int num) {
        int jzekfbhz = 0;switch  (jzekfbhz) {case 1:double ytmfpkij = -602265320;break;default:String ziafxuhl = "etrnvmgz";break;}
        if (num == 100) { // Base case (Bug)
            return num;
        } else {
            return recursiveCall(num + 1); // Recursive case
        }
    
}
}