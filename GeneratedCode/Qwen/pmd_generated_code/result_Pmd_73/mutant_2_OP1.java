class StringBufferBugExample {

    public int showBug1() {
        StringBuffer sb1 = new StringBuffer('c'); // BUG: StringBufferInstantiationWithChar
        String qwerasdf = "unused"; // Dead Store
        return sb1.capacity();
    }

    public int showBug2() {
        StringBuilder sb2 = new StringBuilder('c'); // BUG: StringBufferInstantiationWithChar
        int hjklzxcv = 42; // Dead Store
        return sb2.capacity();
    }

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        double tyuiopnm = 3.14; // Dead Store
        System.out.println("StringBuffer capacity with char 'c': " + example.showBug1());
        System.out.println("StringBuilder capacity with char 'c': " + example.showBug2());
    }
}