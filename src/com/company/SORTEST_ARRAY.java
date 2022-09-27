package com.company;

public class SORTEST_ARRAY {

    public static void merge(int [] arr,int l,int m,int r){
        int i,j,k;
        int[] leftArr = new int[m-l+1];
        int[] rightArr = new int[r-m];

        //copy data from original array
        for(i=l;i<=m;i++){
            leftArr[i-l]=arr[i];
        }
        for(i=m+1;i<=r;i++){
            rightArr[i-(m+1)]=arr[i];
        }

        i=0;
        j=0;
        k=l;
        while(i<leftArr.length && j<rightArr.length){
            if(leftArr[i]<rightArr[j]){
                arr[k]=leftArr[i];
                i++;
            }
            else{
                arr[k]=rightArr[j];
                j++;
            }
            k++;
        }


        while(i<leftArr.length){
            arr[k]=leftArr[i];
            i++;
            k++;
        }

        while(j<rightArr.length){
            arr[k]=rightArr[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr,int l,int r){
        if(l==r){
            return;
        }
        int m = l + (r-l)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
    }

    public static void printArr(int[] arr,int l,int r){
        for(int i=l;i<=r;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,3,4,2,1,6};
        printArr(arr,0,arr.length-1);
        System.out.println("After Sort");
        mergeSort(arr,0,arr.length-1);
        printArr(arr,0,arr.length-1);
    }
}
