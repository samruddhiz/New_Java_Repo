package streameg;
import java.util.Arrays;
import java.util.stream.*;

public class Streams_eg {
	public static void main(String[] args)
	{
		/*int[] arr = {12,5,6,7,3,4,0,8};
		IntStream.of(arr).sorted().forEach(x -> System.out.println(x));;
		*/
		
		//IntStream.range(0,10).findFirst().ifPresent(System.out::print);
		
		String[] str = {"Maya","Sudha","Arun","Mayank"};
		//Stream.of(str).sorted().forEach(System.out::println);
		
		//Arrays.stream(str)
		Stream.of(str)
		//.filter(x -> x.startsWith("M"))
		.filter(x -> x.length()> 4)
		.sorted()
		.forEach(System.out::println);
		
		
		
		/*Arrays.stream(new int[] {2,4,6,8,10})
		.map(x-> x*x)
		.average()
		.ifPresent(System.out::println);
		*/
		
		int[] oddnumbers = {1,2,3,4,5,6,7,8,9,10};
		
		IntStream.of(oddnumbers)
		.filter(x -> x%2 != 0)
		.forEach(System.out::print);
	}
	}

