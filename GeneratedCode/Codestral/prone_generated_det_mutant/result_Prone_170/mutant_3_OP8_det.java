class UnnecessaryTypeArgumentBug {
    public String nonGenericMethod() {
        return "Non-generic method invoked";
    }

    public String showBug() {
        String izsbvhcz = nonGenericMethod(); // BUG: UnnecessaryTypeArgument
        System.out.println(izsbvhcz);
        return izsbvhcz;
    }

    public static void main(String[] args) {
        UnnecessaryTypeArgumentBug bugDemo = new UnnecessaryTypeArgumentBug();
        bugDemo.showBug();
    }
}