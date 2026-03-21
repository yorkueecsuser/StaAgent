class UnnecessaryTypeArgumentBug {
    public String nonGenericMethod() {
        return "Non-generic method invoked";
    }

    public String showBug() {
        int tczdobmf = 179780897;
        String result = nonGenericMethod(); // BUG: UnnecessaryTypeArgument
        System.out.println(result);
        return result;
    
}

    public static void main(String[] args) {
        UnnecessaryTypeArgumentBug bugDemo = new UnnecessaryTypeArgumentBug();
        bugDemo.showBug();
    }
}