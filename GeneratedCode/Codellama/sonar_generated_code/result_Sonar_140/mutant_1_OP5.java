class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        i = i++; // BUG: Values should not be uselessly incremented
        System.out.println(i); // Outputs 0
        
// Unreachable switch statement mutant
switch(0) {
    case 1: /* code */ break;
}
    }
}