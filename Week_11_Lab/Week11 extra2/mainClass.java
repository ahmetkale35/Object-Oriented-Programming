package Week12extra1;

import java.util.ArrayList;

public class mainClass {

	public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("four");
        stringList.add("score");
        stringList.add("and");
        stringList.add("seven");
        stringList.add("years");
        stringList.add("ago");

        System.out.println("Original list: " + stringList);
        switchPairs(stringList);
        System.out.println("List after switching pairs: " + stringList);

        ArrayList<String> oddList = new ArrayList<>();
        oddList.add("to");
        oddList.add("be");
        oddList.add("or");
        oddList.add("not");
        oddList.add("to");
        oddList.add("be");
        oddList.add("hamlet");

        System.out.println("Original odd list: " + oddList);
        switchPairs(oddList);
        System.out.println("Odd list after switching pairs: " + oddList);
    }
	
	 public static void switchPairs(ArrayList<String> list) {
	        int size = list.size();
	        for (int i = 0; i < size - 1; i += 2) {
	            String temp = list.get(i);
	            list.set(i, list.get(i + 1));
	            list.set(i + 1, temp);
	        }
	    }
	}

