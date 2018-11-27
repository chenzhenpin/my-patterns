package demos.patterns.adapter.test2;

import demos.patterns.adapter.test1.Source;
import demos.patterns.adapter.test1.Targetable;

public class Wrapper implements Targetable {  
	  
    private Source source;  
      
    public Wrapper(Source source){  
        super();  
        this.source = source;  
    }

    public void method2() {  
        System.out.println("this is the targetable method!");  
    }  
    
    public void method1() {  
        source.method1();  
    }  
    
} 
