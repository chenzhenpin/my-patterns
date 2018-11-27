package demos.patterns.factory.test3;

import demos.patterns.factory.common.Sender;

public class FactoryTest {
	public static void main(String[] args) {	
		Sender sender = SendFactory.produceMail();
		sender.Send();
	}
}
