package demos.patterns.factory.test4;

import demos.patterns.factory.common.Sender;
import demos.patterns.factory.common.SmsSender;

public class SendSmsFactory implements Provider{
	public Sender produce() {
		return new SmsSender();
	}
}
