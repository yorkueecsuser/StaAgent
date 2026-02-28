class StringBufferBugExample {

    public int showBug1() {
        StringBuffer sb1 = new StringBuffer('c'); // BUG: StringBufferInstantiationWithChar
        return sb1.capacity();
    }

    public int showBug2() {
        StringBuilder sb2 = new StringBuilder('c'); // BUG: StringBufferInstantiationWithChar
        return sb2.capacity();
    }

    public int showBug1Mutant() {
        StringBuffer x = new StringBuffer('c'); // MUTANT: Renamed sb1 to x
        return x.capacity();
    }

    public int showBug2Mutant() {
        StringBuilder y = new StringBuilder('c'); // MUTANT: Renamed sb2 to y
        return y.capacity();
    }

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println("StringBuffer capacity with char 'c': " + example.showBug1());
        System.out.println("StringBuilder capacity with char 'c': " + example.showBug2());
        System.out.println("StringBuffer mutant capacity with char 'c': " + example.showBug1Mutant());
        System.out.println("StringBuilder mutant capacity with char 'c': " + example.showBug2Mutant());
    }
}