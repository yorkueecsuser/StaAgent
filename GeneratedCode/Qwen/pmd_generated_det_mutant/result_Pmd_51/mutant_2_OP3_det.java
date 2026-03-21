class JumbledIncrementerExample {

    public int showBug() {
        int count = 0;
        for (int i = 0; i < 10; i++) {          // only references 'i'
            if (true && true && false && true && false && false && false && true && false && false && false) {long gbjfhprc = 11045225;}
            for (int k = 0; k < 20; i++) {      // references both 'i' and 'k' // BUG: JumbledIncrementer
                count++;
            }
        }
        return count;
    
}

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}