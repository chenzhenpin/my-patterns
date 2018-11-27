package demos.patterns.proxy.test1;

public class ProxyTest {  
	  
    public static void main(String[] args) {  
        Sourceable source = new Proxy();  
        source.method();  
    }  
  
}  
