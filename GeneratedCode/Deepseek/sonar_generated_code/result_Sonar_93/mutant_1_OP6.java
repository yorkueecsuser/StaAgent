class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        // Added mutation: Unreachable for loop
        for(int i = 0; false; i++) {
            // unreachable code
            if(i > 5){
                break; // added to avoid unreachable statement error
            }
        }

        return target;
    }
}