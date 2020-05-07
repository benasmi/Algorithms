public class QuickSort {


    public static void main(String[] args){
        //int[] A = {2, 4, 1, 6, 8, 5, 3, 7};
        int[] A = {10,9,8,7,6,5,4,3,2,1};
        quickSort(A, 0, A.length-1);
        for(int i = 0; i<A.length; i++){
            System.out.println(A[i]);
        }
    }

    /**
     * Partitions array by pivot points and returns pivot index
     *
     * @param A array to partition
     * @param start
     * @param end
     * @return pivot index
     */
    static int partition(int[] A, int start, int end){
        int pivot = A[end];
        int pivotIndex = start;

        for (int i = start; i< end; i++){
            if(A[i]< pivot){
                swap(A, pivotIndex, i);
                pivotIndex++;
            }
        }
        swap(A, pivotIndex, end);

        return pivotIndex;
    }

    /**
     * Sorts array of integers in ascending order
     *
     * @param A array of integers
     * @param start left index(start)
     * @param end right index(end)
     */
    static void quickSort(int[] A, int start, int end){
        if(start<end){
            int pIndex = partition(A, start, end);
            quickSort(A,start, pIndex-1);
            quickSort(A,pIndex+1, end);
        }
    }

    static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
