class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        StringBuilder sb = new StringBuilder(c);
        if (isUnreachable()) {
            System.out.println("This block is unreachable!");
        }
        return sb;
    }

    public static boolean isUnreachable() {
        return false;
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length());
    }
}