package Week12extra2;

import java.util.ArrayList;

public class mainClass {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(7);
		list.add(9);
		list.add(2);
		list.add(5);
		list.add(5);
		list.add(8);
		list.add(5);
		list.add(6);
		list.add(3);
		list.add(4);
		list.add(7);
		list.add(3);
		list.add(1);

		System.out.println("Before : " + list);

		removeBadPairs(list);
		System.out.println("-----------------------------------------------");

		System.out.println("After : " + list);
	}

	public static void removeBadPairs(ArrayList<Integer> list) {
		int size = list.size();

		if (size % 2 != 0) {
			list.remove(size - 1);
			size--;
		}

		for (int i = 0; i < size; i += 2) {
			if (i + 1 < size && list.get(i) > list.get(i + 1)) {
				list.remove(i);
				list.remove(i);
				size -= 2;
				i -= 2;
			}
		}
	}
}
