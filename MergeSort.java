package com.travel.travelapi;

public class MergeSort {

    public static void main(String[] args){
        //int[] A = {2, 4, 1, 6, 8, 5, 3, 7};
        int[] A = {10,9,8,7,6,5,4,3,2,1};

        mergeSort(A);
        for(int i = 0; i<A.length; i++){
            System.out.println(A[i]);
        }
    }

    static void mergeSort(int[] A){
        int nA = A.length;
        int mid = nA/2;

        if(nA == 1)
            return;

        int[] L = new int[mid];
        int[] R = new int[nA-mid];

        for(int i = 0; i<mid; i++){
            L[i] = A[i];
        }
        for(int i = 0; i<nA-mid; i++){
            R[i] = A[i+mid];
        }

        mergeSort(L);
        mergeSort(R);
        merge(L,R,A);
    }

    static void merge(int[] L, int[] R, int[] A){
        int nL = L.length;
        int nR = R.length;
        int i = 0;
        int j = 0;
        int a = 0;

        while(i<nL && j<nR){
            if ((L[i] < R[j])) {
                A[a] = L[i];
                i++;
            } else {
                A[a] = R[j];
                j++;
            }
            a++;
        }
        while(i<nL){
            A[a] = L[i]; a++; i++;
        }
        while(j<nR){
            A[a] = R[j]; a++; j++;
        }
    }
}
