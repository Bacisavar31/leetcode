public class BinarySearch {
    public static int search(int[] nums, int target) {
        int left;
        int mid;
        int right;

        left = 0;
        right = nums.length - 1;
        mid = right / 2;

        while (left <= right) {
            if (target > nums[mid]) {
                left = mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            } else {
                right = mid - 1;
            }

            mid = (right + left) / 2;

        }

        return -1;
    }
}