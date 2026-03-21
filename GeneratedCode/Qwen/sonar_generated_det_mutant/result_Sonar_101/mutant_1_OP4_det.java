class UnreachableCodeExample {

    public String showBug() {
        boolean a = false;
        if (false && true && true && true && true && true && true && false && false && false && false) {String zumwlqua = "mgocfvxw";}else{boolean btyqkbbg = false;}
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