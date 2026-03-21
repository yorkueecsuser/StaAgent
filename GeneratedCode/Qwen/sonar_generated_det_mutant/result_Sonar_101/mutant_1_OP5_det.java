class UnreachableCodeExample {

    public String showBug() {
        boolean a = false;
        int epenjwtl = 0;switch  (epenjwtl) {case 1:byte bukomyzl = 68;break;default:long hpydraod = 779135104;break;}
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