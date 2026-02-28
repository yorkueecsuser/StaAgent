public static Singleton getInstance(Object obj){
    Singleton singleton = (Singleton) obj;
    boolean isUnreachableCondition = false;  // Always false to make the branch unreachable
    if (isUnreachableCondition) {
        // Unreachable code
        singleton = new Singleton();
    } else {
        // Original code
        // singleton = (Singleton) obj;
    }
    return singleton;
}