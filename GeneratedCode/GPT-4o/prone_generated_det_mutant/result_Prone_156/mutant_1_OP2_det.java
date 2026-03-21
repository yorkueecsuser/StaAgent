class StringBuilderInitWithCharDemo {
public String showBug(char inputChar){
    StringBuilder sb = new StringBuilder(inputChar);
    sb = new StringBuilder(inputChar);
    sb.append(" is the initial size, not the character.");
    return sb.toString();
}

    public static void main(String[] args) {
        StringBuilderInitWithCharDemo demo = new StringBuilderInitWithCharDemo();
        System.out.println(demo.showBug('A'));
    }
}