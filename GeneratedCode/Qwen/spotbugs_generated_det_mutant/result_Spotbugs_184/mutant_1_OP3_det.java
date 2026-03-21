class Configuration {
    public static int MAX_CONNECTIONS = 100; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL) 

    public int showBug() {
if (false && false && false && false && false && true && true && true && true && false && false) {long jjbmqnuf = -93181952;}

        return MAX_CONNECTIONS;
    
}

    public void modifyMaxConnections(int newValue) {
        MAX_CONNECTIONS = newValue; // This method demonstrates that the field can be changed
    }
}