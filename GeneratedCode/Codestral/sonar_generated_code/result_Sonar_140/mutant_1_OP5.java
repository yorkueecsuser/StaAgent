class BuggyCode {
    private int getValue() {
        return 0;
    }

    public int showBug() {
        int i = 0;
        int j = 0;

        i = i++;

        int value = getValue();
        switch (value) {
            case 1:
                // Unreachable code
                break;
        }

        return j++;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}