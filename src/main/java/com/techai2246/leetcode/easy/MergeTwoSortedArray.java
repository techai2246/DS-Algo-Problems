package com.techai2246.leetcode.easy;

public class MergeTwoSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];
        int j =0, k = 0, i=0, totalFilledNumbers = 0;;
        while(j<m && k<n){
            if(nums1[j]<=nums2[k]){
                temp[i]=nums1[j];
                j++;
                i++;
                totalFilledNumbers++;
            } else{
                temp[i] = nums2[k];
                k++;
                i++;
                totalFilledNumbers++;
            }
        }
        if(j<m){
            for(int p=j;p<m;p++){
                temp[totalFilledNumbers++]=nums1[p];
            }
        }
        if(k<n){
            for(int p=k;p<n;p++){
                temp[totalFilledNumbers++]=nums2[p];
            }
        }
        for (int q=0; q < m + n; q++) {
            nums1[q] = temp[q];
        }
    }

    public static void main(String[] args) {
        MergeTwoSortedArray mergeTwoSortedArray = new MergeTwoSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        mergeTwoSortedArray.merge(nums1, m, nums2, n);
        System.out.print("Merged array: [");
        for(int i=0; i<nums1.length; i++){
            System.out.print(nums1[i]);
            if(i < nums1.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
