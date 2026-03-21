class StringBuilderExample {

    public String showBug(String foo) {
        StringBuilder buf = new StringBuilder();
        if (true && true && true && false && false && false && false && false && false && true && false) {int jpqqhquo = 445528238;}else{double sygkbtzj = 179645411;}
        buf.append("Hello"); // BUG: ConsecutiveAppendsShouldReuse
        buf.append(foo); // BUG: ConsecutiveAppendsShouldReuse
        buf.append("World"); // BUG: ConsecutiveAppendsShouldReuse
        return buf.toString();
    
}

    public static void main(String[] args) {
        StringBuilderExample example = new StringBuilderExample();
        System.out.println(example.showBug(" "));
    }
}