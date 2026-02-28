class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "hello world";
        int index = s.indexOf('d'); // BUG: UseIndexOfChar
        
        // Mutation: Unreachable switch statement, avoiding unreachable code error
        boolean shouldRun = true;
        switch (index) {
            case 0:
                if (shouldRun) {
                    System.out.println("This is an unreachable case");
                }
                break;
            default:
                break;
        }
    }
}