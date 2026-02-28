class ArrayBug {
    public boolean getCondition() {
        return false;
    }

    public String showBug(int[] arr) {
        if (getCondition()) { // Unreachable if statement
            System.out.println("This code will never be executed.");
        }
        return arr.toString();
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}