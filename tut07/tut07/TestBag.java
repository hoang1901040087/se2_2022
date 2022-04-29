package se2;

public class TestBag {
	public static void main(String[] args) {
		
		TestBag tb = new TestBag();
		
//		init
		System.out.println("Initializing String bag with capacity of 5...");
		ArrayBag<String> bag = new ArrayBag<>(5);
		System.out.println();
		
//		isEmpty, current size
		System.out.println("isEmpty: " + bag.isEmpty());
		System.out.println("current Size: " + bag.getCurrentSize());
		System.out.println();
		
//		add item
		System.out.println("Adding 5 items...");
		bag.add("hello");
		bag.add("my");
		bag.add("name");
		bag.add("is");
		bag.add("Hoang");
		System.out.println("current Size: " + bag.getCurrentSize());
		tb.showBag(bag);
		System.out.println();
		
//		oversizing bag
		System.out.println("Adding one more item...");
		bag.add("extras");
		
		
//		check frequency, contains
		System.out.println("Frequency of \"Hoang\": " + bag.getFrequencyOf("Hoang"));
		System.out.println("Bag contain \"Nam\": " + bag.contains("Nam"));
		System.out.println("Bag contain \"name\": " + bag.contains("name"));
		System.out.println();
		
//		remove, remove form index, clear
		System.out.println("Removing last entry...");
		bag.remove();
		tb.showBag(bag);
		System.out.println();
		
		System.out.println("Removing \"my\" ...");
		bag.remove("my");
		tb.showBag(bag);
		System.out.println();
		
		System.out.println("Clearing the bag...");
		bag.clear();
		tb.showBag(bag);
		System.out.println();
		System.out.println();
		
		
////		TEST
//		int[] arr = new int[5];
//		System.out.println(arr.length);
	}
	
	private void showBag(ArrayBag<String> bag) {
		System.out.println("What's in the bag: ");
		Comparable<String>[] tempBag = bag.toArray();
		for(int i = 0; i < tempBag.length; i++) {
			if(i != tempBag.length-1) {
				System.out.print(tempBag[i] + ", ");
			} else {
				System.out.print(tempBag[i] + "\n");
			}
		}
	}
}
