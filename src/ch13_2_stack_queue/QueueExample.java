package ch13_2_stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("SendMail", "ȫ�浿"));
		messageQueue.offer(new Message("SendSMS", "�ſ��"));
		messageQueue.offer(new Message("Sendkakaotalk", "ȫ�β�"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
				break;
			case "sendSMS" :
				System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
				break;
			case "sendkakaotalk" :
				System.out.println(message.to + "�Կ��� īī������ �����ϴ�.");
				break;
			}
		}
		
	}

}
