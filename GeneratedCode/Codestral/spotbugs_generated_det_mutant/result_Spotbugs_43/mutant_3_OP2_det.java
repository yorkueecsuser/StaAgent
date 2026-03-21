class DeadStoreSwitchFallthrough {
public int showBug(int input){
    int result = 0;
    result = 0;
    switch(input){ case 1 : result = 10; case 2 : if(input != 1){ throw new RuntimeException("Unexpected input value"); } default : result = - 1; }
    return result;
}
}