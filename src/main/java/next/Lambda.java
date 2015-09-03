package next;

import java.util.List;
import java.util.function.Predicate;

public class Lambda {
	public static void printAllOld(List<Integer> numbers) {
		System.out.println("printAllOld");
		
		for (int number : numbers) {
		    System.out.println(number);
		}
	}

	public static void printAllLambda(List<Integer> numbers) {
		System.out.println("printAllLambda");
		
		numbers.forEach(System.out::println);		
	}
	
	public static void runThread() {
		new Thread(() ->System.out.println("Hello from thread")).start();
//		new Thread(new Runnable() {
//		    @Override
//		    public void run() {
//		        System.out.println("Hello from thread");
//		    }
//		}).start();
	}

	
	public static int sum(List<Integer> numbers, Predicate<Integer> p){
		int total = 0;
	    
	    for (int number : numbers) {
	    	if(p.test(number)){
	        total += number;
	    	}
	    }
	    return total;
	}
	
	public static int sumAll(List<Integer> numbers) {
		return sum(numbers,(number)-> true);
	}
	//여기서 (number)->true는 인터페이스의 구현하지 않은 부분이다. 다른 메서드에 인터페이스의 메서드를 구현해서 전달한다.
	
	public static int sumAllEven(List<Integer> numbers) {
		return sum(numbers,(number)->(number % 2 == 0));
	}

	public static int sumAllOverThree(List<Integer> numbers) {
		return sum(numbers,(number)->(number > 3));
	}
}
