class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "cc̈d̈d".replaceAll("[c̈d̈]", "X");
        System.out.println(s);
        
        // Mutated Code
        boolean isTrue = false;
        if(isTrue) {
            String s1 = "cc̈d̈d".replaceAll("[c̈d̈]", "X");
        }
    }
}