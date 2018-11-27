package demos.patterns.factory.test1;

import demos.patterns.factory.common.MailSender;
import demos.patterns.factory.common.Sender;
import demos.patterns.factory.common.SmsSender;

public class SendFactory {
	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确的类型!");
			return null;
		}
	}
}
