package demos.patterns.interpreter.test1;

public class Plus implements Expression {  
	  
 
    public int interpret(Context context) {  
        return context.getNum1()+context.getNum2();  
    }  
}
