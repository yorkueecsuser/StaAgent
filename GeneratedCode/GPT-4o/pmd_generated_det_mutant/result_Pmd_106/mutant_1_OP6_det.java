class StringBuilderExample {

    public String showBug(String foo) {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveAppendsShouldReuse
        for  (int plbmnsmr = 0; plbmnsmr < 0; plbmnsmr++) {double gometpzu = -805405207;}
        buf.append(foo); // BUG: ConsecutiveAppendsShouldReuse
        buf.append("World"); // BUG: ConsecutiveAppendsShouldReuse
        return buf.toString();
    
}

    public static void main(String[] args) {
        StringBuilderExample example = new StringBuilderExample();
        System.out.println(example.showBug(" "));
    }
}