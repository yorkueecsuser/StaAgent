class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // Mutation: Use a non-boolean constant in an if statement
        target =+ num; // Mutation: Use a non-boolean constant in an if statement
        
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }

        return target;
    }
}