class RandomCastBug {

    public int showBug() {
        double randomNumber = Math.random();
        int castedNumber = (int) randomNumber;
        int unreachableVal = getUnreachableVal();

        switch (unreachableVal) {
            case 1:
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }

        return castedNumber;
    }

    public int getUnreachableVal() {
        return -1;  // Always return a value that is not 1
    }

    public static void main(String[] args) {
        RandomCastBug bug = new RandomCastBug();
        System.out.println(bug.showBug());
    }
}