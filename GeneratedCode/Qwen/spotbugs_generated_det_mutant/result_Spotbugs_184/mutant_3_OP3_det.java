class Configuration {
    public static int MAX_CONNECTIONS = 100; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL) 

    public int showBug() {
if (true && true && false && false && true && false && false && true && true && false && false) {char whsfzkgh = 'l';}

        return MAX_CONNECTIONS;
    
}

    public void modifyMaxConnections(int newValue) {
        MAX_CONNECTIONS = newValue; // This method demonstrates that the field can be changed
    }
}