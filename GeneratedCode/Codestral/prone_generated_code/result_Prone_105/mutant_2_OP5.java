class MisleadingEscapedSpaceBug {
    public String showBug() {
        String colors = """
            one \s
            two \s
            three
            """;
        boolean unreachable = false;
        int value = getValue();
        switch (value) {
            case 1:
                if (unreachable) {
                    System.out.println("This code is unreachable.");
                }
                break;
            default:
                break;
        }
        return colors;
    }

    private int getValue() {
        return 0;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceBug bug = new MisleadingEscapedSpaceBug();
        System.out.println(bug.showBug());
    }
}