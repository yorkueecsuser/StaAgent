class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        StringBuilder sb = new StringBuilder(c);
        System.out.println(sb.toString());

        boolean conditionFor = getCondition(); 
        for (int i = 0; conditionFor; i++) { 
            // Unreachable code
            System.out.println("Unreachable code");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}