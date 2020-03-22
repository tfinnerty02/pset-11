import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercises {

// 1
	public int findMe(int[] list, int target) {
		if (Arrays.asList(list).contains(null) || Arrays.asList(list) == null) {
			return -1;
		}

		for (int i = 0; i < list.length; i++) {
			if (list[i] == target) {
				return i;
			}
		}

		return -1;
	}

// 2
	public int findMe(ArrayList<String> list, String target) {
		if (list == null || list.size() == 0 || target == null) {
			return -1;
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(target)) {
				return i;
			}
		}

		return -1;
	}

// 3
	public int findMeFaster(ArrayList<Integer> list, int target) {
		if (list.contains(null) || list == null) {
			return -1;
		}

		int low = 0;
		int high = list.size() - 1;
		int index = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (list.get(mid) < target) {
				low = mid + 1;
			} else if (list.get(mid) > target) {
				high = mid - 1;
			} else if (list.get(mid) == target) {
				index = mid;
				break;
			}
		}

		return index;
	}

// 4
	public int findMeFaster(String[] list, String target) {
		if (Arrays.asList(list).contains(null) || Arrays.asList(list) == null) {
			return -1;
		}

		int start = 0;
		int end = list.length - 1;
		int middle = 0;
		while (start <= end) {
			middle = (start + end) / 2;

			if (list[middle].compareTo(target) < 0) {
				start = middle + 1;
			} else if (list[middle].compareTo(target) > 0) {
				end = middle - 1;
			} else {
				return middle;
			}
		}

		return -1;
	}

// 5
	public int[] bubble(int[] list, boolean ascending) {
		if (Arrays.asList(list).contains(null) || Arrays.asList(list) == null) {
			return null;
		}

		for (int i = 0; i < list.length - 1; i++) {
			for (int j = 0; j < list.length - i - 1; j++) {
				if (list[j] > list[j + 1]) {
					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}

		if (!ascending) {
			int i, t;
			int n = list.length;
			for (i = 0; i < n / 2; i++) {
				t = list[i];
				list[i] = list[n - i - 1];
				list[n - i - 1] = t;
			}
		}

		return list;
	}

// 6
	public ArrayList<String> bubble(ArrayList<String> list, boolean ascending) {
		if (list.contains(null) || list == null) {
			return null;
		}

		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				if (list.get(j).compareTo(list.get(j + 1)) > 0) {
					String temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}

		if (!ascending) {
			Collections.reverse(list);
		}

		return list;

	}

// 7
	public ArrayList<Integer> insertion(ArrayList<Integer> list, boolean ascending) {
		if (list.contains(null) || list == null) {
			return null;
		}

		for (int j = 1; j < list.size(); j++) {
			int temp = list.get(j);
			int i = j - 1;
			while ((i > -1) && (list.get(i) > temp)) {
				list.set(i + 1, list.get(i));
				i--;
			}
			list.set(i + 1, temp);
		}

		if (!ascending) {
			Collections.reverse(list);
		}

		return list;
	}

// 8
	public String[] insertion(String[] list, boolean ascending) {
		if (Arrays.asList(list).contains(null) || Arrays.asList(list) == null) {
			return null;
		}

		for (int j = 1; j < list.length; j++) {
			String current = list[j];
			int i = j - 1;
			while ((i > -1) && (list[i].compareTo(current) > 0)) {
				list[i + 1] = list[i];
				i--;
			}
			list[i + 1] = current;
		}

		if (!ascending) {
			int i;
			String t;
			int n = list.length;
			for (i = 0; i < n / 2; i++) {
				t = list[i];
				list[i] = list[n - i - 1];
				list[n - i - 1] = t;
			}
		}

		return list;
	}

// 9
	public int[] selection(int[] list, boolean ascending) {
		if (Arrays.asList(list).contains(null) || Arrays.asList(list) == null) {
			return null;
		}

		int n = list.length;
		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (list[j] < list[min_idx])
					min_idx = j;

			int temp = list[min_idx];
			list[min_idx] = list[i];
			list[i] = temp;
		}

		if (!ascending) {
			int i, t;
			int x = list.length;
			for (i = 0; i < x / 2; i++) {
				t = list[i];
				list[i] = list[x - i - 1];
				list[x - i - 1] = t;
			}
		}

		return list;
	}

// 10
	public ArrayList<String> selection(ArrayList<String> list, boolean ascending) {
		if (Arrays.asList(list).contains(null) || Arrays.asList(list) == null) {
			return null;
		}

		for (int i = 0; i < list.size(); i++) {
			String smallest = list.get(i);
			int smallestIndex = i;
			for (int j = i; j < list.size(); j++) {
				String value = list.get(j);
				if (value.compareTo(smallest) < 0) {
					smallest = value;
					smallestIndex = j;
				}
			}

			if (smallestIndex != i) {
				String head = list.get(i);
				list.set(i, smallest);
				list.set(smallestIndex, head);
			}
		}

		if (!ascending) {
			Collections.reverse(list);
		}

		return list;
	}

// 11
	public ArrayList<Integer> merge(ArrayList<Integer> list, boolean ascending) {
		if (list.contains(null) || list == null) {
			return null;
		}

		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		int center;

		if (list.size() == 1) {
			return list;
		} else {
			center = list.size() / 2;
			for (int i = 0; i < center; i++) {
				left.add(list.get(i));
			}

			for (int i = center; i < list.size(); i++) {
				right.add(list.get(i));
			}

			left = merge(left, true);
			right = merge(right, true);
			combineHalves(left, right, list);
		}

		if (!ascending) {
			Collections.reverse(list);
		}

		return list;
	}

// combines ArrayLists from exercise 11
	private void combineHalves(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> complete) {
		int leftIndex = 0;
		int rightIndex = 0;
		int completeArrayIndex = 0;

		while (leftIndex < left.size() && rightIndex < right.size()) {
			if ((left.get(leftIndex).compareTo(right.get(rightIndex))) < 0) {
				complete.set(completeArrayIndex, left.get(leftIndex));
				leftIndex++;
			} else {
				complete.set(completeArrayIndex, right.get(rightIndex));
				rightIndex++;
			}
			completeArrayIndex++;
		}

		ArrayList<Integer> rest;
		int restIndex;
		if (leftIndex >= left.size()) {
			rest = right;
			restIndex = rightIndex;
		} else {
			rest = left;
			restIndex = leftIndex;
		}

		for (int i = restIndex; i < rest.size(); i++) {
			complete.set(completeArrayIndex, rest.get(i));
			completeArrayIndex++;
		}
	}

// 12
	public String[] merge(String[] list, boolean ascending) {
		if (Arrays.asList(list).contains(null) || Arrays.asList(list) == null) {
			String[] temp = new String[0];
			return temp;
		}

		if (list.length >= 2) {
			String[] left = new String[list.length / 2];
			String[] right = new String[list.length - list.length / 2];

			for (int i = 0; i < left.length; i++) {
				left[i] = list[i];
			}

			for (int i = 0; i < right.length; i++) {
				right[i] = list[i + list.length / 2];
			}

			merge(left, true);
			merge(right, true);
			combine(list, left, right);
		}

		if (!ascending) {
			int i;
			String t;
			int x = list.length;
			for (i = 0; i < x / 2; i++) {
				t = list[i];
				list[i] = list[x - i - 1];
				list[x - i - 1] = t;
			}
		}

		return list;
	}

// combines arrays from exercise 12
	private static void combine(String[] list, String[] left, String[] right) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < list.length; i++) {
			if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
				list[i] = left[a];
				a++;
			} else {
				list[i] = right[b];
				b++;
			}
		}
	}
}
