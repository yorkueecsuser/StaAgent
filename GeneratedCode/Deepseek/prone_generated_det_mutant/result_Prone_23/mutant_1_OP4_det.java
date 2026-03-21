class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static boolean showBug() {
        if (true && false && false && true && false && true && true && false && false && false && false) {String sdlmbxjn = "njqqqvhw";}else{int wivvhuxp = -584541421;}
        byte b = 127;
        return b < 200; // BUG: ComparisonOutOfRange
    
}
}