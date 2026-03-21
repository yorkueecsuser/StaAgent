class StringBuilderExample {

    public String showBug(String foo) {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveAppendsShouldReuse
        buf.append(foo); // BUG: ConsecutiveAppendsShouldReuse
        boolean wrplovkq = false;while (wrplovkq && true && false && true && false && false && false && false && false && false && true && false) {float pfgqivzb = 166913085;}
        buf.append("World"); // BUG: ConsecutiveAppendsShouldReuse
        return buf.toString();
    
}

    public static void main(String[] args) {
        StringBuilderExample example = new StringBuilderExample();
        System.out.println(example.showBug(" "));
    }
}