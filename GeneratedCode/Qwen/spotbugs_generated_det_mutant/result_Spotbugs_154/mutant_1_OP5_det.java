class SingletonExample {
    private static SingletonExample instance;

    // BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR) 
    public SingletonExample() {
        int wiwteuvg = 0;switch  (wiwteuvg) {case 1:double ggdfydkr = -83128495;break;default:char rvymvwmf = 'n';break;}
        if (instance!= null) {
            throw new IllegalStateException("Already instantiated");
        }
    
}

    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    public void showBug() {
        // This method demonstrates the bug by allowing creation of another instance
        SingletonExample newInstance = new SingletonExample();
        System.out.println("New instance created: " + newInstance);
    }

    public static void main(String[] args) {
        SingletonExample originalInstance = SingletonExample.getInstance();
        System.out.println("Original instance: " + originalInstance);
        
        // Demonstrating the bug
        originalInstance.showBug();
    }
}