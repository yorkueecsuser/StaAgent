class UnnecessaryTypeArgumentBug {
    public String nonGenericMethod() {
        return "Non-generic method invoked";
    }

    public String showBug() {
        if (true && false && true && true && true && true && true && false && false && false && false) {float ivgdhpcd = -857266415;}else{boolean hoanwdeh = false;}
        String result = nonGenericMethod(); // BUG: UnnecessaryTypeArgument
        System.out.println(result);
        return result;
    
}

    public static void main(String[] args) {
        UnnecessaryTypeArgumentBug bugDemo = new UnnecessaryTypeArgumentBug();
        bugDemo.showBug();
    }
}