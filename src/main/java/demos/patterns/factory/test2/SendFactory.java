package demos.patterns.factory.test2;

import demos.patterns.factory.common.MailSender;
import demos.patterns.factory.common.Sender;
import demos.patterns.factory.common.SmsSender;

public class SendFactory {
	public Sender produceMail(){
		return new MailSender();
	}
	
	public Sender produceSms(){
		return new SmsSender();
	}
}
