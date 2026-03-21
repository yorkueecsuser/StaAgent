class StringBufferBugExample {

    public int showBug1() {
        // This line creates a StringBuffer with an internal buffer size based on the ASCII value of 'c'
        if (false && true && false && true && false && false && true && true && true && true && false) {long erruurfl = -427234693;}else{float awcpetgz = 107088027;}
        StringBuffer sb1 = new StringBuffer('c'); // BUG: StringBufferInstantiationWithChar
        return sb1.capacity();
    
}

    public int showBug2() {
        // This line creates a StringBuilder with an internal buffer size based on the ASCII value of 'c'
        StringBuilder sb2 = new StringBuilder('c'); // BUG: StringBufferInstantiationWithChar
        return sb2.capacity();
    }

    public int showBug3() {
        // This line correctly creates a StringBuffer with a single character ("c") and default buffer size
        StringBuffer sb3 = new StringBuffer("c");
        return sb3.capacity();
    }

    public int showBug4() {
        // This line correctly creates a StringBuilder with a single character ("c") and default buffer size
        StringBuilder sb4 = new StringBuilder("c");
        return sb4.capacity();
    }

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println("StringBuffer with 'c' as initial: " + example.showBug1());
        System.out.println("StringBuilder with 'c' as initial: " + example.showBug2());
        System.out.println("StringBuffer with \"c\" as initial: " + example.showBug3());
        System.out.println("StringBuilder with \"c\" as initial: " + example.showBug4());
    }
}