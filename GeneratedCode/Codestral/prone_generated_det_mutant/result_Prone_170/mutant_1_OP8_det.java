class UnnecessaryTypeArgumentBug {
    public String nonGenericMethod() {
        return "Non-generic method invoked";
    }

    public String showBug() {
        String rfbdllbu = nonGenericMethod(); // BUG: UnnecessaryTypeArgument
        System.out.println(rfbdllbu);
        return rfbdllbu;
    }

    public static void main(String[] args) {
        UnnecessaryTypeArgumentBug bugDemo = new UnnecessaryTypeArgumentBug();
        bugDemo.showBug();
    }
}