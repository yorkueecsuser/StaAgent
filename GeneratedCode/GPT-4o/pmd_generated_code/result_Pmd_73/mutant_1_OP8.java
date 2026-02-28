class StringBufferBugExample {

    public int showBug1() {
        // This line creates a StringBuffer with an internal buffer size based on the ASCII value of 'c'
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

    public int showBug1_mutant() {
        // Mutant: Renaming StringBuffer variable to 'a'
        StringBuffer a = new StringBuffer('c'); // BUG: StringBufferInstantiationWithChar
        return a.capacity();
    }

    public int showBug2_mutant() {
        // Mutant: Renaming StringBuilder variable to 'b'
        StringBuilder b = new StringBuilder('c'); // BUG: StringBufferInstantiationWithChar
        return b.capacity();
    }

    public int showBug3_mutant() {
        // Mutant: Renaming StringBuffer variable to 'x'
        StringBuffer x = new StringBuffer("c");
        return x.capacity();
    }

    public int showBug4_mutant() {
        // Mutant: Renaming StringBuilder variable to 'y'
        StringBuilder y = new StringBuilder("c");
        return y.capacity();
    }

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println("StringBuffer with 'c' as initial: " + example.showBug1());
        System.out.println("StringBuilder with 'c' as initial: " + example.showBug2());
        System.out.println("StringBuffer with \"c\" as initial: " + example.showBug3());
        System.out.println("StringBuilder with \"c\" as initial: " + example.showBug4());

        // Output from mutant methods
        System.out.println("Mutant StringBuffer with 'c' as initial: " + example.showBug1_mutant());
        System.out.println("Mutant StringBuilder with 'c' as initial: " + example.showBug2_mutant());
        System.out.println("Mutant StringBuffer with \"c\" as initial: " + example.showBug3_mutant());
        System.out.println("Mutant StringBuilder with \"c\" as initial: " + example.showBug4_mutant());
    }
}