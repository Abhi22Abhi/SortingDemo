package abhi.java8.sort;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
//		return o2.compareTo(o1);
//		return -o1.compareTo(o2);
		return o2-o1;
	}
}
