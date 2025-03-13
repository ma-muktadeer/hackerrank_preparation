package test.hacker.math.sort.Quicksort;

import java.util.Arrays;

public class Result {
    // Quicksort মেথড
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high); // পিভট ঠিক করা
            System.out.println("pivot index= "+pivotIndex);
            quickSort(arr, low, pivotIndex - 1); // বাম অংশকে sort করা
            quickSort(arr, pivotIndex + 1, high); // ডান অংশকে sort করা
        }
    }

    // Partition মেথড (পিভট অনুযায়ী এলিমেন্টগুলো ভাগ করা)
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // সাধারণত শেষ এলিমেন্টকে পিভট ধরা হয়
        
        System.out.println("pivot= " + pivot);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) { // যদি এলিমেন্ট পিভটের চেয়ে ছোট হয়
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high); // পিভটকে তার সঠিক অবস্থানে নেওয়া
        return i + 1; // পিভটের নতুন ইনডেক্স ফেরত দেওয়া
    }

    // Swap মেথড (দুইটি ইনডেক্সের ভ্যালু অদলবদল করা)
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
        System.out.println("Sorted= " + Arrays.toString(arr));
    }

}
