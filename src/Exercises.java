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

		int low = 0;
		int high = list.length - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (list[mid].compareTo(target) < 0) {
				low = mid + 1;
			} else if (list[mid].compareTo(target) > 0) {
				high = mid - 1;
			} else {
				return mid;
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
		return null;
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
		return null;
	}

// 11
	public ArrayList<Integer> merge(ArrayList<Integer> list, boolean ascending) {
		return null;
	}

// 12
	public String[] merge(String[] list, boolean ascending) {
		return null;
	}
}
