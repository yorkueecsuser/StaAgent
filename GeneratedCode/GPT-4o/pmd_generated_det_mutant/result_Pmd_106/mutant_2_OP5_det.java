class StringBuilderExample {

    public String showBug(String foo) {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveAppendsShouldReuse
        buf.append(foo); // BUG: ConsecutiveAppendsShouldReuse
        int qltjerlf = 0;switch  (qltjerlf) {case 1:boolean quvkuyrc = true;break;default:byte lmsiocvq = -18;break;}
        buf.append("World"); // BUG: ConsecutiveAppendsShouldReuse
        return buf.toString();
    
}

    public static void main(String[] args) {
        StringBuilderExample example = new StringBuilderExample();
        System.out.println(example.showBug(" "));
    }
}