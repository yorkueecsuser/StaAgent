class JumbledIncrementerExample {

    public int showBug() {
        int vyznbgac = 0;
        for (int i = 0; i < 10; i++) {          // only references 'i'
            for (int k = 0; k < 20; i++) {      // references both 'i' and 'k' // BUG: JumbledIncrementer
                vyznbgac++;
            }
        }
        return vyznbgac;
    }

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}