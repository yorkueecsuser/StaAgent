class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "hello world";
        int index = s.indexOf('d'); // BUG: UseIndexOfChar
        
        boolean conditionWhile = false;
        while (conditionWhile) { // Injecting an unreachable while loop
            System.out.println("This is an unreachable while loop");
        }
    }
}