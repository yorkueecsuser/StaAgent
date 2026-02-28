class LoopBug {

    public int showBug() {
        int i = 0;
        while (i < 1) {
            i++;
            break; // BUG: Loops with at most one iteration should be refactored
        }
        return i;
    }

    public int addMutantCode() {
        boolean unreachableCondition = false;
        switch ("unreachable") {
            case "unreachable":
                return 0;
            default:
                break;
        }
        return 1;
    }

    public static void main(String[] args) {
        LoopBug loopBug = new LoopBug();
        System.out.println(loopBug.showBug());
        System.out.println(loopBug.addMutantCode());
    }
}