class StringBufferBugExample {

    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 2; // Arbitrary value that is not used in the case labels
    }

    public int showBug1() {
        // This line creates a StringBuffer with an internal buffer size based on the ASCII value of 'c'
        StringBuffer sb1 = new StringBuffer('c'); // BUG: StringBufferInstantiationWithChar
        // Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("Unreachable case 1");
                break;
            case 2:
                System.out.println("Unreachable case 2");
                break;
        }
        return sb1.capacity();
    }

    public int showBug2() {
        // This line creates a StringBuilder with an internal buffer size based on the ASCII value of 'c'
        StringBuilder sb2 = new StringBuilder('c'); // BUG: StringBufferInstantiationWithChar
        // Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 3:
                System.out.println("Unreachable case 3");
                break;
            case 4:
                System.out.println("Unreachable case 4");
                break;
        }
        return sb2.capacity();
    }

    public int showBug3() {
        // This line correctly creates a StringBuffer with a single character ("c") and default buffer size
        StringBuffer sb3 = new StringBuffer("c");
        // Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 5:
                System.out.println("Unreachable case 5");
                break;
            case 6:
                System.out.println("Unreachable case 6");
                break;
        }
        return sb3.capacity();
    }

    public int showBug4() {
        // This line correctly creates a StringBuilder with a single character ("c") and default buffer size
        StringBuilder sb4 = new StringBuilder("c");
        // Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 7:
                System.out.println("Unreachable case 7");
                break;
            case 8:
                System.out.println("Unreachable case 8");
                break;
        }
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