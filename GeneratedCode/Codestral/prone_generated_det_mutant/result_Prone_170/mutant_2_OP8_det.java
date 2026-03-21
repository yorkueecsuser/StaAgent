class UnnecessaryTypeArgumentBug {
    public String nonGenericMethod() {
        return "Non-generic method invoked";
    }

    public String showBug() {
        String qhyxfplq = nonGenericMethod(); // BUG: UnnecessaryTypeArgument
        System.out.println(qhyxfplq);
        return qhyxfplq;
    }

    public static void main(String[] args) {
        UnnecessaryTypeArgumentBug bugDemo = new UnnecessaryTypeArgumentBug();
        bugDemo.showBug();
    }
}