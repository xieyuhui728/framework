package com.xieyuhui.jdk.leetCode.medium;

/**
 * @Auther: xieyuhui
 * @Date: 2019-07-23 20:59
 * @Description: 在未排序的数组中找到第 k 个最大的元素。
 */
public class FindKthLargest {
    public static void main(String[] args) {
        int[] a = {3, 2, 1, 5, 6, 4};
        int result = solution(a, 2);
        System.out.println(result);
    }

    public static int solution(int[] nums, int k) {
        if (nums.length < k) {
            return -1;
        }
        quickSort(nums, 0, nums.length - 1);
        return nums[nums.length - k];
    }

    /**
     * @param arr
     * @param start
     * @param end
     */

    private static void quickSort(int[] arr, int start, int end) {
        if (end <= start) {
            return;
        }
        int low = start;
        int high = end;
        //基准
        int pivot = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= pivot) {
                high--;
            }
            // 将小于 pivot 的数放在低位
            arr[low] = arr[high];
            while (low < high && arr[low] <= pivot) {
                low++;
            }
            // 将大于 pivot 的数放在高位
            arr[high] = arr[low];
        }
        //重制基准
        arr[low] = pivot;
        // 递归排序左半部分
        quickSort(arr, start, low - 1);
        // 递归排序右半部分
        quickSort(arr, low + 1, end);
    }
}
