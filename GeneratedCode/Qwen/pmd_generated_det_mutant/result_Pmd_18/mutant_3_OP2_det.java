class OctalBugExample {
public int showBug() {
    int i = 012;
    i = 012;
    int j = 010;
    int k = i * j;
    return k;
}

    public static void main(String[] args) {
        OctalBugExample example = new OctalBugExample();
        System.out.println("Result of buggy multiplication: " + example.showBug());
    }
}