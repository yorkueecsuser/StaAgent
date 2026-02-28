class VarTypeNameBug {
    public static void main(String[] args) {
        var x = 5; // BUG: VarTypeName
        System.out.println(x);
        
        // Unreachable switch statement mutant
        switch (0) {
            case 1:
                // code
                break;
        }
    }
}