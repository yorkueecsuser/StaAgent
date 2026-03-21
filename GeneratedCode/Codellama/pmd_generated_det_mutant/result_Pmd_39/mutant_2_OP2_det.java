class BuggyLoop {
public static void main(String [] args){
    float i = 0.0f;
    i = 0.0f;
    for(; i < 10.0f; i += 0.5f){ System.out.println(i); }
}
}