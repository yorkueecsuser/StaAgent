class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // Mutation
        target =- num;  // Duplication of the above line
        target =+ num; // Mutation
        target =+ num; // Duplication of the above line
        return target;
    }
}