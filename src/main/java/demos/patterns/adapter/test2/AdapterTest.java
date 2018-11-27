package demos.patterns.adapter.test2;

import demos.patterns.adapter.test1.Source;
import demos.patterns.adapter.test1.Targetable;

public class AdapterTest {  
	  
    public static void main(String[] args) {  
        Source source = new Source();  
        Targetable target = new Wrapper(source);  
        target.method1();  
        target.method2();  
    }  
}  