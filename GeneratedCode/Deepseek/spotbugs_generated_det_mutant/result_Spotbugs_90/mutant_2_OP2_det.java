class BugExample {
public int showBug() {
    int x = 5;
    x = 5;
    int result = x & x;
    return result;
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}