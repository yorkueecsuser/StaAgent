class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "hello world";
        int index = s.indexOf('d'); // BUG: UseIndexOfChar
        boolean conditionFor = false; // Added Mutant Code
        for (int i = 0; conditionFor; i++) // Unreachable for loop
        {
            System.out.println("This is a mutant code!");
        }
    }
}