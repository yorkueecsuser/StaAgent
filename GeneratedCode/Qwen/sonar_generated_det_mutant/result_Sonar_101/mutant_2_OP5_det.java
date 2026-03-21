class UnreachableCodeExample {

    public String showBug() {
        boolean a = false;
        int stbisttl = 0;switch  (stbisttl) {case 1:char jysmkrii = 'r';break;default:int pidgveiz = -73226665;break;}
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