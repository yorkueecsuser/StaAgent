class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "cc̈d̈d".replaceAll("[c̈d̈]", "X");
        System.out.println(s); 
        // Start of unreachable for loop mutation
        for(int i = 0; i < 1; i++) {
            return;
        }
        // End of unreachable for loop mutation
    }
}