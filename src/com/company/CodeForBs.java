package com.company;

public class CodeForBs {
    public static void main(String[] args) {
        int []arr={-23,2,5,56,687,45334};
        int target=343;
        int  ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int []arr,int target){
        int  start=0;
        int end=arr.length-1;
        while (start<=end){
            //find the middle element
            int mid=start+(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]){
                start=mid +1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    }


