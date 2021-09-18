package capg.co;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute{
	int sequence() default 5;
}
class Anno3 {
	
	@Execute(sequence=2)
	public void myMethod1() {}
	
	@Execute(sequence=1)
	public void myMethod2() {}
	
	@Execute(sequence=3)
	public void myMethod3() {}
}

public class Annotation3 {

	public static void main(String[] args) {

	}

}
