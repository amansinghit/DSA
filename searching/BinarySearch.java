package binarysearch;

public class BianrySearch {
	public static boolean isAcc(int[] arr) {
		if (arr[0] < arr.length)
			return true;
		return false;
	}

	public static boolean isDes(int[] arr) {
		if (arr[0] > arr.length)
			return true;
		return false;
	}

	public static int bianrySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length;
		while (start <= end) {
			int mid = (start + end) / 2;

			if (isAcc(arr)) {
				if (arr[mid] > target) {
					end = mid - 1;
				} else if (arr[mid] < target) {
					start = mid + 1;
				} else if (arr[mid] == target)
					return mid;

			}
			if (isDes(arr)) {
				if (arr[mid] > target) {
					start = mid + 1;
				} else if (arr[mid] < target) {

					end = mid - 1;
				} else if (arr[mid] == target)
					return mid;

			}

		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {44,77,77,88,99 };
		int target = 77;
		System.out.println("value of index is" + bianrySearch(arr, target));
	}

}
