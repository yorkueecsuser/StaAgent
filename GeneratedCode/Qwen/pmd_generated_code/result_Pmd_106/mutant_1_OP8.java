class ConsecutiveAppendsExample {

    public String showBug() {
        StringBuffer buf = new StringBuffer();
        buf.append("Hello"); // BUG: ConsecutiveAppendsShouldReuse
        buf.append(" ");
        buf.append("World");
        return buf.toString();
    }

    public static void main(String[] args) {
        ConsecutiveAppendsExample example = new ConsecutiveAppendsExample();
        System.out.println(example.showBug());

        // Mutant code with Renaming mutation operator
        StringBuffer x = new StringBuffer();
        x.append("Hello");
        x.append(" ");
        x.append("World");
        System.out.println(x.toString());
    }
}