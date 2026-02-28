class MisleadingEscapedSpaceExample {

    public String showBug() {
        // Each line here is five characters long.
        String colors = """
            one \s // BUG: MisleadingEscapedSpace
            two \s // BUG: MisleadingEscapedSpace
            three
            """;
        
        // Unreachable switch statement inserted
        int unreachableValue = calculateUnreachableValue();
        switch (unreachableValue) {
            case 42: // This case is intentionally unreachable
                System.out.println("This will never print");
                break;
            default:
                break;
        }

        return colors;
    }

    private int calculateUnreachableValue() {
        // Logic ensuring the value returned is not 42
        return 0;
    }

    public static void main(String[] args) {
        MisleadingEscapedSpaceExample example = new MisleadingEscapedSpaceExample();
        System.out.println(example.showBug());
    }
}