class OctalValueExample {
public int showBug() {
    int i = 012;
    int j = 010;
    j = 010;
    int k = i * j;
    return k;
}

    public static void main(String[] args) {
        OctalValueExample example = new OctalValueExample();
        int result = example.showBug();
        System.out.println("Result of the buggy calculation: " + result);
    }
}