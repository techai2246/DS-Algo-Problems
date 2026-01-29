package com.techai2246.leetcode.easy;

/**
 * MergeTwoSortedArray - Merges two sorted arrays into a single sorted array.
 *
 * Problem Description:
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of valid elements in nums1 and nums2 respectively.
 * Merge nums2 into nums1 as one sorted array.
 *
 * Example:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: nums1 = [1,2,2,3,5,6]
 *
 * Algorithm:
 * - Use two pointers to track positions in both arrays
 * - Compare elements and add smaller one to temporary array
 * - Handle remaining elements from both arrays
 * - Copy merged result back to nums1
 *
 * Time Complexity: O(m + n)
 * Space Complexity: O(m + n) for temporary array
 *
 * @author techai2246
 * @version 1.0
 */
public class MergeTwoSortedArray {
    /**
     * Merges two sorted arrays into a single sorted array.
     * Modifies nums1 in-place to contain the merged result.
     *
     * @param nums1 first sorted array with enough space for merged result
     * @param m number of valid elements in nums1
     * @param nums2 second sorted array
     * @param n number of valid elements in nums2
     */
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
