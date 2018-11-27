package demos.patterns.factory.test4;

import demos.patterns.factory.common.MailSender;
import demos.patterns.factory.common.Sender;

public class SendMailFactory implements Provider {

	public Sender produce(){
		return new MailSender();
	}

	
}
