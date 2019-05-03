package application;

import java.util.LinkedList;

public class Topic {
	private LinkedList<Question> questionList;
	private String topic;
	
	public Topic(String topic) {
		this.topic = topic;
		questionList = new LinkedList<Question>();
	}
	
	public void addQuestion(Question q){
		questionList.add(q);
	}
	
	public String getName() {
		return topic;
	}
	
	public LinkedList<Question> getQuestionList(){
		return questionList;
	}
	
	
}
