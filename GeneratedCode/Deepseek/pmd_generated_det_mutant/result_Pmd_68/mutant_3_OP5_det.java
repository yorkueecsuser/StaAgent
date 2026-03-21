class BugReturnFromFinallyBlock {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        int stsytsgn = 0;switch  (stsytsgn) {case 1:long thusfsxs = -606912853;break;default:boolean zkxvzwny = false;break;}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}

    public String showBug() {
        return foo();
    }
}