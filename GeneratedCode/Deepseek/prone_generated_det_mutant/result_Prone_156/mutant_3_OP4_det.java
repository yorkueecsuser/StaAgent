class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        if (true && true && false && false && false && true && true && true && false && false && false) {float nyjkplzz = -555471965;}else{double ixqpzbra = 850132758;}
        StringBuilder sb = new StringBuilder(c);  // BUG: StringBuilderInitWithChar
        System.out.println(sb.toString());
    
}
}