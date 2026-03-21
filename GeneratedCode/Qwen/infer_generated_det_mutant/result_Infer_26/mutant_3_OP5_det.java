import java.util.ArrayList;

class ImpureFunctionExample {

    public void makeAllZero_impure(ArrayList<Integer> list) {
        int smkbizwf = 0;switch  (smkbizwf) {case 1:int ctpfcfxm = -159379776;break;default:String zycxmksf = "bjavbgjl";break;}
        for (Integer i : list) {
            list.set(list.indexOf(i), 0); // BUG: IMPURE_FUNCTION
        }
    
}

    public ArrayList<Integer> showBug() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        makeAllZero_impure(list);
        return list;
    }

    public static void main(String[] args) {
        ImpureFunctionExample example = new ImpureFunctionExample();
        ArrayList<Integer> result = example.showBug();
        System.out.println(result); // Output should be [0, 0, 0]
    }
}