package demos.patterns.builder.test1;


public class Test {
 
	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(10);
	}
}