class ArrayBug {
    public String showBug(int[] arr) {
        // Adding unreachable switch statement
        int unreachableValue = -1;
        switch (unreachableValue) {
            case 1:
                System.out.println("This code should never be executed");
                break;
            // Add more cases if necessary
        }

        return arr.toString(); // BUG: ArrayToString
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}