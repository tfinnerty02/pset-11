import java.util.ArrayList;
import java.util.Arrays;

public class Exercises {

	public int findMe(int[] list, int target) {
		if(Arrays.asList(list).contains(null)) {
			return -1;
		}
		
		for (int i = 0; i < list.length; i++) {
			if (list[i] == target) {
				return i;
			}
		}

		return -1;
	}

	public int findMe(ArrayList<String> list, String target) {
		return -1;
	}

	public int findMeFaster(ArrayList<Integer> list, int target) {
		return -1;
	}

	public int findMeFaster(String[] list, String target) {
		return -1;
	}

	public int[] bubble(int[] list, boolean ascending) {
		return null;
	}

	public ArrayList<String> bubble(ArrayList<String> list, boolean ascending) {
		return null;
	}

	public ArrayList<Integer> insertion(ArrayList<Integer> list, boolean ascending) {
		return null;
	}

	public String[] insertion(String[] list, boolean ascending) {
		return null;
	}

	public int[] selection(int[] list, boolean ascending) {
		return null;
	}

	public ArrayList<String> selection(ArrayList<String> list, boolean ascending) {
		return null;
	}

	public ArrayList<Integer> merge(ArrayList<Integer> list, boolean ascending) {
		return null;
	}

	public String[] merge(String[] list, boolean ascending) {
		return null;
	}
}
