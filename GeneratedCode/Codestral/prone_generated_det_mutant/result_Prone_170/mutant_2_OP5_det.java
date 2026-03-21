class UnnecessaryTypeArgumentBug {
    public String nonGenericMethod() {
        return "Non-generic method invoked";
    }

    public String showBug() {
        int rulfvzqn = 0;switch  (rulfvzqn) {case 1:char cglpqiwg = 'v';break;default:float asysmpgl = -411970322;break;}
        String result = nonGenericMethod(); // BUG: UnnecessaryTypeArgument
        System.out.println(result);
        return result;
    
}

    public static void main(String[] args) {
        UnnecessaryTypeArgumentBug bugDemo = new UnnecessaryTypeArgumentBug();
        bugDemo.showBug();
    }
}