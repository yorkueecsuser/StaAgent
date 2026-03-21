class UselessStringBug {

    public boolean getCondition(){
        return false; // this method always returns false to make the loop unreachable
    }

    public String showBug() {
        // insert unreachable for loop
        for (int i = 0; getCondition(); i++){
            // this code is unreachable
            System.out.println("Unreachable code");
        }
        // original bug is still present
        String result = new int[] {1, 2, 3}.toString();
        return result;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}