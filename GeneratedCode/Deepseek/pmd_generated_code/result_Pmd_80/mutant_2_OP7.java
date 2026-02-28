class BugUnnecessaryCaseChange {
    public boolean showBug(String str) {
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        boolean conditionWhile = false;
        boolean conditionFor = false;
        int value = 0;
        while (conditionWhile) { // Unreachable While loop
            value++;
            if (value % 2 == 0) {
                conditionFor = true;
            }
            if (value >= 100) {
                conditionWhile = false;
            }
        }
        for (int i = 0; conditionFor; i++) { // Unreachable For loop
            value++;
            if (value % 2!= 0) {
                conditionFor = false;
            }
            if (value >= 200) {
                conditionWhile = true;
            }
        }
        switch (value) { // Unreachable Switch statement
            case 1: // Unreachable case
                value++;
                break;
            case 2: // Unreachable case
                value--;
                break;
            default: // Unreachable default case
                value = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}