package com.company;

public class Test {
    public static void main(String[] args) {
        int []arr={-5,23,565,78778,523453};
        int target=45345345;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int []arr,int target){
    int start=0;
    int end=arr.length-1;
    while (start<=end){
        int mid=start+(end-start)/2;
        if (target>arr[mid]){//dam dike target thakbe so start change hobe
            start=mid+1;
        }
        else if (target<arr[mid]){
            end=mid-1;
        }
        else {
            return mid;
        }
    }
        return -1;
    }
}
