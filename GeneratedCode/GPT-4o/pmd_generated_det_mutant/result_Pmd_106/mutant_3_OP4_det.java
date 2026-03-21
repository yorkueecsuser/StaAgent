class StringBuilderExample {

    public String showBug(String foo) {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveAppendsShouldReuse
        buf.append(foo); // BUG: ConsecutiveAppendsShouldReuse
        if (true && false && true && false && true && false && false && false && true && true && false) {long wfblxbne = -13287115;}else{float ajnjnwlj = -546624309;}
        buf.append("World"); // BUG: ConsecutiveAppendsShouldReuse
        return buf.toString();
    
}

    public static void main(String[] args) {
        StringBuilderExample example = new StringBuilderExample();
        System.out.println(example.showBug(" "));
    }
}