class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        StringBuilder stringBuilderVariable = new StringBuilder(c); // Mutant: Renamed'sb' to'stringBuilderVariable'
        return stringBuilderVariable;
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}