class VarTypeNameBug {
    public static void main(String[] args) {
        var x = 5; // BUG: VarTypeName
        System.out.println(x);
        int value = getValue();
        switch(value) {
            case 0:
                System.out.println("This branch is unreachable");
                break;
            case 1:
                System.out.println("This branch is reachable");
                break;
            default:
                System.out.println("This branch is also unreachable");
                break;
        }
    }
    public static int getValue() {
        return 1;
    }
}