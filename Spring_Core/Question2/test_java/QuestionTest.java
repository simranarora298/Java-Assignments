package spring.question2;

import static org.junit.jupiter.api.Assertions.*;

//import java.util.List;
//import java.util.Arrays;
//import java.util.Set;
//import java.util.HashSet;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QuestionTest {

	private Question ques;
	
	@BeforeEach
	public  void init()
	{
		//ques= new Question(1, "Where do you live?", Arrays.asList("Delhi","Gurgaon","Pune"));
		//ques= new Question(1, "Where do you live?", new HashSet<>(Arrays.asList("Delhi","Gurgaon","Pune","Delhi")));
		
		//ques= new Question(1, "Where do you live?", Map.of(1,"Delhi",2,"Bnaglore", 3, "Pune", 1, "Delhi", 4, "Pune"));
		ques= new Question(1, "Where do you live?", Map.of(1,"Delhi",2,"Bnaglore", 3, "Pune", 4, "Delhi", 5, "Mumbai"));				
				
	} 
	@Test
	void testGetQuestionId() {
		assertEquals(1,ques.getQuestionId());
		//fail("Not yet implemented");
	}
	
	@Test
	void testGetQuestion() {
		assertEquals("Where do you live?",ques.getQuestion());
		//fail("Not yet implemented");
	}

	@Test
	void testGetAnswer() {
		/*
		 * List<String> expected = Arrays.asList("Delhi","Gurgaon","Pune"); 
		 * List<String> actual = ques.getAnswer();
		 */
		
		/*
		 * //Set<String> expected = Set.of("Delhi","Gurgaon","Pune","Delhi");
		 * Set<String> expected = Set.of("Delhi","Gurgaon","Pune"); 
		 * Set<String> actual = ques.getAnswer();
		 */
		
		Map<Integer,String> expected = Map.of(1,"Delhi",2,"Bnaglore", 3, "Pune", 4, "Delhi", 5, "Mumbai");
		Map<Integer,String> actual = ques.getAnswer();
		
		assertEquals(expected,actual);
		//fail("Not yet implemented");
	}

}
