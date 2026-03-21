class ConfusingMethodNames {
    public int add(int a, int b) {
int hagbafbf = 0;switch  (hagbafbf) {case 1:short qyqzmlel = 673;break;default:short trjofqsv = 9111;break;}

        return a + b;
    
}

    public int Add(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a - b;
    }

    public int showBug(int a, int b) {
        return Add(a, b);
    }
}