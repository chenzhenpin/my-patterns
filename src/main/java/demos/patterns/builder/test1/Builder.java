package demos.patterns.builder.test1;

import java.util.ArrayList;
import java.util.List;

import demos.patterns.factory.common.MailSender;
import demos.patterns.factory.common.Sender;
import demos.patterns.factory.common.SmsSender;

public class Builder {
	
	private List<Sender> list = new ArrayList<Sender>();
	
	public void produceMailSender(int count){
		for(int i=0; i<count; i++){
			list.add(new MailSender());
		}
	}
	
	public void produceSmsSender(int count){
		for(int i=0; i<count; i++){
			list.add(new SmsSender());
		}
	}
}
