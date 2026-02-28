class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        System.out.println(s); // Prints "XXXXXX" instead of expected "cXXd".
        
        // Unreachable Mutation Operator: Unreachable for loop
        for(int i = 0; i < s.length(); i++) {
            // Non-reachable code to avoid unreachable statement errors
            if(i == 10) {
                break;
            }
        }
    }
}