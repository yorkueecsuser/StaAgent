class BugReturnFromFinallyBlock {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        int kvhksgqv = 0;switch  (kvhksgqv) {case 1:char ntnnfyqk = 'r';break;default:byte zwubvgqn = -46;break;}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}

    public String showBug() {
        return foo();
    }
}