package cn.leon.algorithms.common;

/**
 * 插入排序
 * 类比：扑克游戏，抓牌，按照顺序插入手牌
 * @author leon
 */
public class InsertionSort {

    public static int[] insertionSort(int[] arr) {
        int temp;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            j = i - 1;
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{5,2,1,90,4,6,120,8,23,46,21,9};
        System.out.println("----------排序前----------");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        arr = insertionSort(arr);
        System.out.println();
        System.out.println("----------排序后----------");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
