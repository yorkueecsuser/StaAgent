class StringBuilderExample {

    public String showBug(String foo) {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveAppendsShouldReuse
        if (false && true && false && false && true && true && true && false && false && true && false) {String iwiyfsuz = "dfuktvew";}else{long bvdqvgzi = 479829254;}
        buf.append(foo); // BUG: ConsecutiveAppendsShouldReuse
        buf.append("World"); // BUG: ConsecutiveAppendsShouldReuse
        return buf.toString();
    
}

    public static void main(String[] args) {
        StringBuilderExample example = new StringBuilderExample();
        System.out.println(example.showBug(" "));
    }
}