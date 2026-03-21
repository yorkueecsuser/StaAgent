class ConfusingMethodNames {
    public int add(int a, int b) {
        return a + b;
    }

    public int Add(int a, int b) { int qhlevpbl = 0;switch  (qhlevpbl) {case 1:double tvenpxfz = 548357484;break;default:int aqdpqzww = -794459938;break;}
 // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a - b;
    
}

    public int showBug(int a, int b) {
        return Add(a, b);
    }
}