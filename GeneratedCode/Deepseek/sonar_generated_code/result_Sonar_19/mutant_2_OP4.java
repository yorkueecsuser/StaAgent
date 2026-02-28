class ArrayBug {

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        showBug(arr);
    }

    public static int showBug(int[] arr) {
        boolean unreachableCondition = false;
        // The condition of the if statement is guaranteed to be false
        if (unreachableCondition) {
            System.out.println("This code will never be executed");
        } else { // This branch is unreachable
            System.out.println("This code is unreachable");
        }
        
        // Return a value to avoid any compilation error
        return 0;
    }
}