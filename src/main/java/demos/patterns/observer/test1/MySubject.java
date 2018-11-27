package demos.patterns.observer.test1;

public class MySubject extends AbstractSubject {  
	  
 
    public void operation() {  
        System.out.println("update self!");  
        notifyObservers();  
    }  
  
}  