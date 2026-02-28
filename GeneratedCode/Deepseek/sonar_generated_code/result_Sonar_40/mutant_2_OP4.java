class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); 
        System.out.println(s); 
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println("This branch should be reachable");
        } else {
            System.out.println("This branch should never be reached");
        }
    }
}