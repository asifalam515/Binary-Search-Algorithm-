package com.company;

public class Test2 {
    public static void main(String[] args) {
        int []arr={78,56,22,10,-10};
        int target=3423;
        int ans=binaryFromDescending(arr,target);
        System.out.println(ans);
    }

    static int binaryFromDescending(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target>arr[mid]){
                end=mid-1;
            }
            else if (target<arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
