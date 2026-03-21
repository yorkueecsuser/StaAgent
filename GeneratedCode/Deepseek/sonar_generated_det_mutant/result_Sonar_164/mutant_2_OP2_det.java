class FloatingPointBug {
public void showBug() {
    float myNumber = 3.146f;
    if(myNumber == 3.146f){ System.out.println("This line contains a bug"); }
    if(myNumber != 3.146f){ System.out.println("This line contains a bug"); }
    if(myNumber < 4 || myNumber > 4){ System.out.println("This line contains a bug"); }
    float zeroFloat = 0.0f;
    zeroFloat = 0.0f;
    if(zeroFloat == 0){ System.out.println("This line contains a bug"); }
}

    public static void main(String[] args) {
        FloatingPointBug bug = new FloatingPointBug();
        bug.showBug();
    }
}