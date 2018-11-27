package demos.patterns.visitor.test1;

public interface Subject {  
    public void accept(Visitor visitor);  
    public String getSubject();  
} 
