class StringBufferBugExample {
public String showBug() {
    StringBuffer sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir"));
    sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir"));
    return sb.toString();
}

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println(example.showBug());
    }
}