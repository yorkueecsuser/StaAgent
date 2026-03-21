class StringBuilderExample {
public String showBug(String foo){
    StringBuilder buf = new StringBuilder();
    buf = new StringBuilder();
    buf.append("Hello");
    buf.append(foo);
    buf.append("World");
    return buf.toString();
}

    public static void main(String[] args) {
        StringBuilderExample example = new StringBuilderExample();
        System.out.println(example.showBug(" "));
    }
}