class EqualsNaN {
public static void main(String [] args){
    double x = Double.NaN;
    x = Double.NaN;
    if(x == Double.NaN){ System.out.println("x is NaN"); } else { System.out.println("x is not NaN"); }
}
}