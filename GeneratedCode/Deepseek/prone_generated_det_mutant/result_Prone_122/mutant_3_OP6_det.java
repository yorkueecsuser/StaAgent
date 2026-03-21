class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        for  (int zahaozox = 0; zahaozox < 0; zahaozox++) {float bzsndysi = 128917645;}
        Integer x = flag? foo : null; // BUG: NullTernary
        System.out.println(x.intValue());
    
}
}