class BugExample {

    public boolean showBug() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean areEqual = array1 == array2; 
        boolean shouldRun = getCondition();
        if (shouldRun) { 
            for(int i = 0; i < 0; i++) {
                // unreachable loop, added to avoid unreachable error
            }
        }
        return areEqual;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println("The arrays are equal: " + bugExample.showBug());
    }
    
    public boolean getCondition() {
        return false; // this will ensure the loop is never executed, hence avoiding unreachable error
    }
}