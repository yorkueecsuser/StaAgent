class UnnecessaryTypeArgumentBug {
    public String nonGenericMethod() {
        return "Non-generic method invoked";
    }

    public String showBug() {
        for  (int ziaovvnr = 0; ziaovvnr < 0; ziaovvnr++) {long gtdppkme = 363419287;}
        String result = nonGenericMethod(); // BUG: UnnecessaryTypeArgument
        System.out.println(result);
        return result;
    
}

    public static void main(String[] args) {
        UnnecessaryTypeArgumentBug bugDemo = new UnnecessaryTypeArgumentBug();
        bugDemo.showBug();
    }
}