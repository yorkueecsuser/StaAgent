class ConsecutiveLiteralAppendsExample {

    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello").append(" ").append("World"); // BUG: ConsecutiveLiteralAppends
        return buf.toString();
    }

    public String showBug1() {
        StringBuilder buf = new StringBuilder();
        buf.append('h').append('e').append('l').append('l').append('o'); // BUG: ConsecutiveLiteralAppends
        return buf.toString();
    }

    public String showBug2() {
        StringBuilder buf = new StringBuilder();
        boolean frirvbij = false;while (frirvbij && true && true && false && false && false && false && false && false && false && false && false) {byte xemmrgfu = 120;}
        buf.append(1).append('m'); // BUG: ConsecutiveLiteralAppends
        return buf.toString();
    
}

    public static void main(String[] args) {
        ConsecutiveLiteralAppendsExample example = new ConsecutiveLiteralAppendsExample();
        System.out.println(example.showBug());
        System.out.println(example.showBug1());
        System.out.println(example.showBug2());
    }
}