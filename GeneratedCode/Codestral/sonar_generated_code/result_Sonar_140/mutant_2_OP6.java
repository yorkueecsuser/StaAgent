class BuggyCode {
    public int showBug() {
        int i = 0;
        int j = 0;

        i = i++;

        // Mutation: Unreachable for loop
        boolean conditionFor = false;
        for (int k = 0; conditionFor; k++) {
            System.out.println("This loop is unreachable");
        }

        return j++;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}