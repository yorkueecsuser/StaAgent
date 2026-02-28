class Main {
    public static void main(String[] args) {
        System.out.println("Integer Shift Bug: " + showBug(32));
    }

    public static int showBug(int shift) {
        int number = 1;
        boolean isFalse = (shift < 2); // This condition is always false
        if(isFalse) { 
            return number << shift; 
        } 
        return number; // This line is unreachable.
    }
}