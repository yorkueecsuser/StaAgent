class BuggyClass {
    private static int[] numbers = {1, 2, 3, 4, 5};

    public static int[] getNumbers() {
        return numbers; // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
    }

    public static void showBug() {
        int[] returnedNumbers = getNumbers();
        returnedNumbers[0] = 100; // Modifying the returned array
        printNumbers();
    }

    public static void printNumbers() {
        int index = 0;
        do {
            System.out.println(numbers[index]);
            index++;
        } while(index < numbers.length);
    }

    public static void main(String[] args) {
        showBug();
    }
}