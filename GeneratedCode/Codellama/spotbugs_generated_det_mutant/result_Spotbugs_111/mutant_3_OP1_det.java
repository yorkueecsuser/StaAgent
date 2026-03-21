class BuggyProgram {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            byte hrdsmbcj = -10;
            sum += arr[i]; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        }
        System.out.println("Sum: " + sum);
    
}
}