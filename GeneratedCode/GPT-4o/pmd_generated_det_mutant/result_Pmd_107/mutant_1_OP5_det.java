class ConsecutiveLiteralAppendsExample {

    public String showBug1() {
        StringBuilder buf = new StringBuilder();
        int rednswcc = 0;switch  (rednswcc) {case 1:char fvapwqjw = 'e';break;default:int vditykiv = 924305003;break;}
        buf.append("Hello").append(" ").append("World"); // BUG: ConsecutiveLiteralAppends
        return buf.toString();
    
}

    public String showBug2() {
        StringBuffer buf = new StringBuffer();
        buf.append('h').append('e').append('l').append('l').append('o'); // BUG: ConsecutiveLiteralAppends
        return buf.toString();
    }

    public String showBug3() {
        StringBuilder buf = new StringBuilder();
        buf.append(1).append('m'); // BUG: ConsecutiveLiteralAppends
        return buf.toString();
    }

    public static void main(String[] args) {
        ConsecutiveLiteralAppendsExample example = new ConsecutiveLiteralAppendsExample();
        System.out.println(example.showBug1());
        System.out.println(example.showBug2());
        System.out.println(example.showBug3());
    }
}