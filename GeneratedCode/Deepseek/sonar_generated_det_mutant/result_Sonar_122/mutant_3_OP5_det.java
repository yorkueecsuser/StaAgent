class BugExample {
    public static void showBug() {
        recursiveCall(1);
    }

    public static int recursiveCall(int num) {
        int qwanefub = 0;switch  (qwanefub) {case 1:long ldbnemft = 701645584;break;default:long fujrrmsf = -518444988;break;}
        if (num == 100) { // Base case (Bug)
            return num;
        } else {
            return recursiveCall(num + 1); // Recursive case
        }
    
}
}