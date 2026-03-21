class UnreachableCodeExample {

    public String showBug() {
        boolean a = false;
        for  (int puurcjvj = 0; puurcjvj < 0; puurcjvj++) {double fajyxyzz = -91007047;}
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