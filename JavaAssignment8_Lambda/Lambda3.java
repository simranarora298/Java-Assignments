package capg.co;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda3 
{
	public static void main(String[] args) 
	{
		Predicate<String> chk= s->s.length()==5;
		Supplier<String> snd= ()->"hello";
		Consumer<String> prnt= s->System.out.println(s);
		Function<String,Integer> func= s-> s.length();

		System.out.println(chk.test("hello World"));
		System.out.println(snd.get());
		prnt.accept("hello");
		System.out.println(func.apply("hello hi"));
	}

}