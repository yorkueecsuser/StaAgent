class StringBuilderBug {
    public String showBug() {
        StringBuilder sb = new StringBuilder('A');

        // Unreachable switch statement mutant
        int value = getUnreachableValue();
        switch(value) {
            case 1:
                System.out.println("This is an unreachable switch case");
                break;
        }

        return sb.toString();
    }

    private int getUnreachableValue() {
        // This method is designed to always return a value that is not 1
        // to make the switch case unreachable
        // For simplicity, it returns 0
        return 0;
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }
}