package demos.patterns.bridge.test1;

public class MyBridge extends Bridge {  
    public void method(){  
        getSource().method();  
    }  
} 