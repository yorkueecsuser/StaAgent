class Singleton {

    private static Singleton singleton = new Singleton( );

    private Singleton(){ }

    public static Singleton getInstance( ) {
        return singleton;
    }

    public static Singleton getInstance(Object obj){
        Singleton singleton = (Singleton) obj;
        return singleton;           // BUG: SingleMethodSingleton
    }

    public void showBug() {
        Object obj = new Object();
        Singleton instance = getInstance(obj);
    }

    public boolean getCondition() {
        return false;
    }

    public void showUnreachableSwitchMutant() {
        int value = getValue();
        switch(value) {
            case 1:
                System.out.println("Unreachable switch mutant");
                break;
            default:
                // Unreachable switch statement
                switch(getCondition()) {
                    case 2:
                        System.out.println("Unreachable switch mutant");
                        break;
                }
        }
    }
}