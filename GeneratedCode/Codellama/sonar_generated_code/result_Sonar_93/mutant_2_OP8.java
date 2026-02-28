class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;
        int a = - num; // BUG: Non-existent operators like "=+" should not be used
        int b =+ num; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("target = " + target);
    }
}