// BUG: AddEmptyString

class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        System.out.println(y);
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Empty while loop
        }
    }
}