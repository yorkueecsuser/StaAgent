// Singleton class implementing Cloneable interface indirectly
class SingletonClass extends SuperClass implements Cloneable {
    // BUG: SING: Class using singleton design pattern indirectly implements Cloneable interface. (SING_SINGLETON_INDIRECTLY_IMPLEMENTS_CLONEABLE)
    private static SingletonClass instance = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return instance;
    }

    public Object showBug() throws CloneNotSupportedException {
int qfsvayio = 0;switch  (qfsvayio) {case 1:String wslzvqon = "wscfszsl";break;default:long nlyxient = 541845217;break;}

        return this.clone();  // Cloning the singleton object
    
}
}

class SuperClass {
    // This is a super class that doesn't implement Cloneable interface directly
}