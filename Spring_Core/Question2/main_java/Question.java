package spring.question2;

//import java.util.List;
//import java.util.Set;
import java.util.Map;

public class Question 
{
	private int questionId;
	private String question;
	//private List<String> answer;
	//private Set<String> answer;
	private Map<Integer,String> answer;
	
	/*public Question(int questionId, String question, List<String> answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}*/
	
	/*public Question(int questionId, String question, Set<String> answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}*/
	
	public Question(int questionId, String question, Map<Integer, String> answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}
	
	public int getQuestionId() {
		return questionId;
	}
	
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	 /*public List<String> getAnswer() 
	  { 
	  	return answer; 
	  } 
	 public void setAnswer(List<String> answer) 
	  { 
	  	this.answer = answer; 
	  }*/
	 
	 
	/*public Set<String> getAnswer() {
		return answer;
	}
	public void setAnswer(Set<String> answer) {
		this.answer = answer;
	}*/
	
	public Map<Integer, String> getAnswer() {
		return answer;
	}
	public void setAnswer(Map<Integer, String> answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "questionId=" + questionId + ", question=" + question + ", answer=" + answer;
	}
	
}
