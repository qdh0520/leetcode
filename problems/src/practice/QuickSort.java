package practice;

/**
 * 快速排序
 */
public class QuickSort {

     public static void quickSort(int[] list){


         quickSort(list,0, list.length-1);
     }

    public static void quickSort(int[]list,int first ,int last) {

        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }
        public static int partition(int[] list,int first, int last){
           int pivot =list[first];// choose and as the pivot
            int low=first+1;// index for forward search
            int high =last;// index for backward search
       while (high>low){
            while (low<=high && list[low]<=pivot)
                low++;
            while (low<=high && list[high]>pivot)
                high--;
            if (high>low){
                int temp=list[high];
                list[high]=list[low];
                list[low]=temp;
            }
        }
            while (high>first && list[high]>=pivot)
               high--;
            if(pivot>list[high]){
                list[first]=list[high];
                list[high]=pivot;
                return  high;

            }else {
                return  first;
            }

        }

    public static void main(String[] args) {
//        int[] list = {2,3,2,5,6,1,-2,3,14,12};
        int[] list1={5,2,9,3,8,21,0,10,6,7};

        quickSort(list1);
        for (int i=0; i<list1.length;i++)
            System.out.println(list1[i]+"");
    }
}
