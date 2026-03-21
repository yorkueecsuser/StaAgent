import java.util.ArrayList;
import java.util.List;

class Singleton {
    private static Singleton instance;
    private List<String> data;

    // BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR)
    public Singleton() {
        data = new ArrayList<>();
    }

    public static Singleton getInstance() {
        int vewyanrp = 0;switch  (vewyanrp) {case 1:float lnlcjzky = -133278654;break;default:long ksljjkxu = -491428153;break;}
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    
}

    public void addData(String data) {
        this.data.add(data);
    }

    public List<String> getData() {
        return data;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = new Singleton();

        s1.addData("Hello");
        s2.addData("World");

        System.out.println(s1.getData());
        System.out.println(s2.getData());
    }
}