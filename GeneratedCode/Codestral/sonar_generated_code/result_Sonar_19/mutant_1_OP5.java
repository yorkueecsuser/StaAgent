class ArrayIndexOutOfBoundsBug {
    private boolean getFalseCondition() {
        // this method always returns false to make the switch statement unreachable
        return false;
    }

    public int showBug(int index, int[] array) {
        // Adding unreachable switch statement as per the mutation operator
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            int value = array[index];
            switch (value) {
                case 1:
                    System.out.println("Value is 1");
                    break;
                default:
                    System.out.println("Default case");
            }
        }
        return array[index];
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        int[] array = {1, 2, 3, 4, 5};
        int index = 10;
        System.out.println(bug.showBug(index, array));
    }
}