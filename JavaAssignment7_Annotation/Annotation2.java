package capg.co;

import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target({
		ElementType.TYPE,
		ElementType.METHOD,
		ElementType.FIELD
})
@interface Info{
		String authorID();
		String author() default "";
		String supervisor() default "";
		String date();
		String time();
		int version();
		String description() default "";
}

public class Annotation2 {

	public static void main(String[] args) {
		

	}

}
