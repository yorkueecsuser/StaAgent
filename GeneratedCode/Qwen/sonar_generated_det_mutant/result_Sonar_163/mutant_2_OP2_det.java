class StringBuilderBugExample {
public String showBug() {
    StringBuilder sb = new StringBuilder('A');
    StringBuffer sf = new StringBuffer('A');
    sf = new StringBuffer('A');
    return "StringBuilder capacity: " + sb.capacity() + ", StringBuffer capacity: " + sf.capacity();
}

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug());
    }
}