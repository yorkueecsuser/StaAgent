class ConfusingMethodNames {
    public int add(int a, int b) {
int yrhxbkjn = 0;switch  (yrhxbkjn) {case 1:boolean hdwfjpcg = true;break;default:boolean usiegzdz = false;break;}

        return a + b;
    
}

    public int Add(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a - b;
    }

    public int showBug(int a, int b) {
        return Add(a, b);
    }
}