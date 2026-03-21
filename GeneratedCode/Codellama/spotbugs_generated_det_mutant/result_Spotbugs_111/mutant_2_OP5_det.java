class BuggyProgram {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int hvdyvyim = 0;switch  (hvdyvyim) {case 1:int dbokvlje = 339934946;break;default:double nahbqyki = -984619015;break;}
            sum += arr[i]; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        }
        System.out.println("Sum: " + sum);
    
}
}