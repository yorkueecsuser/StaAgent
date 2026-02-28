class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // original code
        target =+ num; // original code

        //Mutant code: Added a unreachable while loop
        boolean conditionWhile = true;
        while (conditionWhile) {
            System.out.println("Unreachable loop");
        }

        return target;
    }
}