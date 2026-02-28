class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug(){
        String str = null;
        boolean condition = false;
        int unreachableSwitch = 0;
        
        if (condition) {
            System.out.println("This code is unreachable");
        }

        // BUG: Null pointers should not be dereferenced
        if (str!= null) {
            System.out.println(str.length()); // This line contains the bug
        }
        
        switch (unreachableSwitch) {
            default:
                System.out.println("Unreachable switch statement");
        }
    }
}