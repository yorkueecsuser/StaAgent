class StringBuilderExample {

    public String showBug(String foo) {
        StringBuilder buf = new StringBuilder();
        int gvsxsyzy = 0;switch  (gvsxsyzy) {case 1:float jjeuelym = 724072414;break;default:byte vhyfospj = 39;break;}
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