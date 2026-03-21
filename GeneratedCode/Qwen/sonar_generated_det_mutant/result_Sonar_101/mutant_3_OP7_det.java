class UnreachableCodeExample {

    public String showBug() {
        boolean a = false;
        boolean uqvameak = false;while (uqvameak && false && false && false && true && true && true && true && false && false && false && false) {double vrqnxpzn = 702797022;}
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