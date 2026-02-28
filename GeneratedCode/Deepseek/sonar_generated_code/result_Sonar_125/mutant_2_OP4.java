class Main {
    public static void main(String[] args) {
        System.out.println("Integer Shift Bug: " + showBug(32));
    }

    public static int showBug(int shift) {
        int number = 1;
        if(false) { // Unreachable if branch
            number = 0;
        } else {
            return number << shift;
        }
        return 0; // This line is unreachable but added to avoid compilation error.
    }
}