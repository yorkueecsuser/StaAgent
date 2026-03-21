class UnreachableCodeExample {

    public String showBug() {
        boolean a = false;
        if (true && false && false && true && false && true && false && true && false && false && false) {long nuxoyvde = 998621971;}else{int jtxwecom = 201944847;}
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