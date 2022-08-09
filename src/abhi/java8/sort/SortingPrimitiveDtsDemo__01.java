package abhi.java8.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingPrimitiveDtsDemo__01 {

	public static void main(String[] args) {
		
		System.out.println(" Asc or Desc ==> Collections.reverse(list); or Anonymous Class or sort(list, comparatorRef) or Streams");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println();
		
		
		
		//Primitives Sorting
		List<Integer> list = Arrays.asList(20, 70, 10, 30, 40, 20);
		System.out.println("Original List : "+list);
		System.out.println();
		
		//Asc
		Collections.sort(list);
		System.out.println("For Asendind order :-- Collections.sort(list); => "+list);
		System.out.println();
	
		
		//Descending ==> Collections.reverse(list); or sort(list, comparatorRef) or Pure LambdaExps or Anonymous Class or Streams  
		Collections.reverse(list);
		System.out.println("For Desending order :-- Collections.reverse(list); => "+list);
		System.out.println();
		
//		Collections.sort(list, new MyComparator());
		MyComparator myComparator = new MyComparator();
		Collections.sort(list, myComparator);
		System.out.println("For Descending order :-- Collections.sort(list, comparatorRef); => "+list);
		System.out.println();
		
		Collections.sort(list, (o1, o2) -> o2-o1);
		System.out.println("For Descending order :-- Collections.sort(list, Pure LambdaExps); => "+list);
		System.out.println();

		//Anonymous Class
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		System.out.println("For Descending order :-- Collections.sort(list, Anonymous Class); => "+list);
		System.out.println();
		
		
		
		
//														Functional Programming
//		Streams ==> Ascending Order                        
		System.out.println("Streams ==> Ascending Order => stream().sorted()");
		list.stream().sorted().forEach(element -> System.out.println(element));
		System.out.println();
		
//		Streams ==> Descending Order
		System.out.println("Streams ==> Descending Order => stream().sorted(Comparator.reverseOrder())");
		list.stream().sorted(Comparator.reverseOrder()).forEach(element -> System.out.println(element));		
		System.out.println();
		
		System.out.println("Streams ==> Descending Order => stream().sorted(Comparator.naturalOrder())");
		list.stream().sorted(Comparator.naturalOrder()).forEach(emp -> System.out.println(emp));
		System.out.println();
		
		System.out.println("Streams ==> Descending Order => stream().sorted(compare()_Lamda)");
		list.stream().sorted((O1, O2) -> O2-O1).forEach(element -> System.out.println(element));		
		System.out.println();
		
//		sorted(Comparator.comparing())	
//		list.stream().sorted(Comparator.comparing(---)).forEach(element -> System.out.println(element));		

	
	}
}
