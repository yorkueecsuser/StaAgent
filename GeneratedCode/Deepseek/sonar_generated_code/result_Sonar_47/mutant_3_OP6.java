class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static boolean showBug() {
        String regex = "(?:)*"; // BUG: Repeated patterns in regular expressions should not match the empty string
        String str = "";
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // mutant code - unreachable for loop
            if(i > 10) { // this code is added to avoid unreachable statement errors
                break;
            }
        }
        return str.matches(regex);
    }

    public static boolean getCondition() {  // this method is used to make the loop condition dynamic
        return false;
    }
}