class UnreachableCodeExample {

    public String showBug() {
        boolean a = false;
        if (false && true && false && true && false && false && true && true && true && false && false) {long ixzssphy = 347394009;}else{String aglculhq = "qwsbbojy";}
        if (a) { // BUG: Conditionally executed code should be reachable
            return "This will never be returned";
        }

        boolean b = true;
        if (!a || b) { // BUG: Conditionally executed code should be reachable
            return "This will always be returned";
        } else {
            return "This will never be returned";
        }
    
}

    public static void main(String[] args) {
        UnreachableCodeExample example = new UnreachableCodeExample();
        System.out.println(example.showBug());
    }
}