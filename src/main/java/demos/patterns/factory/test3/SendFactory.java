package demos.patterns.factory.test3;

import demos.patterns.factory.common.MailSender;
import demos.patterns.factory.common.Sender;
import demos.patterns.factory.common.SmsSender;

public class SendFactory {
	public static Sender produceMail(){
		return new MailSender();
	}
	
	public static Sender produceSms(){
		return new SmsSender();
	}

}
