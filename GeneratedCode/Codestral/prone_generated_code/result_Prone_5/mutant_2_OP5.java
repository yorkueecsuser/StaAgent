class ArrayBug {
    public String showBug(int[] arr) {
        int invalidValue = getInvalidValue(); // added method for mutation
        switch (invalidValue) { // unreachable switch statement
            case 1:
                return "Unreachable code";
        }
        return arr.toString();
    }

    private int getInvalidValue() {
        return -1; // will never return 1
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}