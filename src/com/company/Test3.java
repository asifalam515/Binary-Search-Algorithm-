package com.company;

public class Test3 {
    public static void main(String[] args) {
        int []arr={234,45,42,21,4,-5};
        int target=45;
        int ans=orderAgnosticBs(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticBs(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc;
        if (arr[start]<arr[end]){
            isAsc=true;
        }
        else {
            isAsc=false;
        }
        while (end>=start){
        int mid=start+(end-start)/2;
        if (arr[mid]==target){
            return mid;
        }
        if (isAsc){
            if (target>arr[mid]){
                start=mid+1;
            }
            else if (target<arr[mid]){
                end=mid-1;
            }
        }
        else {
            if (target<arr[mid]){
                start=mid+1;
            }
            else if (target>arr[mid]){
                end=mid-1;
            }
        }

        }
        return -1;
    }
}
