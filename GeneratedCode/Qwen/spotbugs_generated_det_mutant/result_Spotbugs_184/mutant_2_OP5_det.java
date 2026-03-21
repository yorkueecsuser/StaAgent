class Configuration {
    public static int MAX_CONNECTIONS = 100; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL) 

    public int showBug() {
int xwuxqjra = 0;switch  (xwuxqjra) {case 1:short krnqiwfs = 1449;break;default:int yvbanjka = -542585750;break;}

        return MAX_CONNECTIONS;
    
}

    public void modifyMaxConnections(int newValue) {
        MAX_CONNECTIONS = newValue; // This method demonstrates that the field can be changed
    }
}