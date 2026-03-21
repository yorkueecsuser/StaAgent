class UnnecessaryTypeArgumentBug {
    public String nonGenericMethod() {
        return "Non-generic method invoked";
    }

    public String showBug() {
        long apvsyepa = 871753789;
        String result = nonGenericMethod(); // BUG: UnnecessaryTypeArgument
        System.out.println(result);
        return result;
    
}

    public static void main(String[] args) {
        UnnecessaryTypeArgumentBug bugDemo = new UnnecessaryTypeArgumentBug();
        bugDemo.showBug();
    }
}