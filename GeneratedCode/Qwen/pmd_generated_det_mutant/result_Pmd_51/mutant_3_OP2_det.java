class JumbledIncrementerExample {
public int showBug() {
    int count = 0;
    count = 0;
    for(int i = 0; i < 10; i ++){ for(int k = 0; k < 20; i ++){ count ++; } }
    return count;
}

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}