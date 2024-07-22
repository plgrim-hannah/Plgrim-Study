import kr.co.plgrim.arraylist.hannah.MyArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		MyArrayList<Object> arrayList = new MyArrayList<>();
		arrayList.add("감자");
		arrayList.add("감자");
		arrayList.add("한나");
		arrayList.add("이리");
		arrayList.add("이지");
		System.out.println(" set= " + arrayList.set(2, "서연"));
		System.out.println(" remove= " + arrayList.remove("감자"));
		System.out.println("arrayList = " + arrayList);



/*

		Iterator<Object> its = arrayList.iterator();

		System.out.println(its.next());

		while(its.hasNext()) {
			System.out.println(its.next());
		}
*/


		System.out.println("========================================");

		// Make a collection
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("감자");
		cars.add("한나");
		cars.add("이리");
		cars.add("이지");

		System.out.println(cars);

		// Get the iterator
		Iterator<String> it = cars.iterator();

		// Print the first item
		System.out.println(it.next());


		while(it.hasNext()) {
			System.out.println(it.next());
		}



	}
}