class UnreachableCodeExample {

    public void showBug() {
        boolean a = false;
        if (a) { // BUG: Conditionally executed code should be reachable
            System.out.println("This will never be printed");
        }

        boolean b = false;
        if (!a || b) { // BUG: Conditionally executed code should be reachable
            System.out.println("This will also never be printed");
        } else {
            System.out.println("This will always be printed");
        }
    }

    public static void main(String[] args) {
        UnreachableCodeExample example = new UnreachableCodeExample();
        example.showBug();
    }
}