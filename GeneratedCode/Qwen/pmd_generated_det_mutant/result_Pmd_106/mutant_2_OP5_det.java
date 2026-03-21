class ConsecutiveAppendsExample {

    public String showBug() {
        StringBuffer buf = new StringBuffer();
        int rafqgawv = 0;switch  (rafqgawv) {case 1:double ehlnizqp = -592955960;break;default:long jbpedrna = 190116245;break;}
        buf.append("Hello"); // BUG: ConsecutiveAppendsShouldReuse
        buf.append(" ");
        buf.append("World");
        return buf.toString();
    
}

    public static void main(String[] args) {
        ConsecutiveAppendsExample example = new ConsecutiveAppendsExample();
        System.out.println(example.showBug());
    }
}