public class Sorts {

    public int[] bubbleSort(int[] nums){
        int a;
        int b;
        for(int i = 0; i < nums.length; i++){
            a = nums[i];
            b = nums[i+1];
            if(a < b){
                nums[i] = nums[i]; //do nothing
            }
            else{
                nums[i] = b;
                nums[i+1] = a;
            }
        }
        return nums;
    }


    public int[] mergeSort(int[] nums){
        if (nums.length == 1){
            return nums;
        }

        int[] left = mergeSort(splitting(nums, 0,nums.length/2));
        int[] right = mergeSort(splitting(nums, nums.length/2,nums.length));




        return nums;
    }

    private static int[] splitting(int[] n, int start, int stop){
        int[] newN = new int[n.length/2];
        int p = 0;
        for(int i = start; i < stop; i++){
            newN[p] = n[i];
            p++;
        }
        return newN;
    }

    private static int[] merge(int[] n1, int[] n2){
        int[] s = new int[n1.length + n2.length];

        /*
        int d = 0;
        for (int i = 0; i < n1.length; i++){
            s[i] = n1[i];
            d++;
        }

        for (int a = 0; a < n2.length; a++){
            s[d] = n2[a];
            d++;
        }


        for (int k = 0; k < s.length; k++){

        }
         */
    }

    public int[] selectionSort(int[] nums){
        for (int a = 0; a < nums.length; a++){

            int min = nums[a];
            int minIndex = a;
            for (int i = a; i < nums.length; i++){
                if (nums[i] < min){
                    min = nums[i];
                    minIndex = i;
                }
            }
            int temp = nums[a];
            nums[a] = min;
            nums[minIndex] = temp;

        }
        return nums;
    }

    public int[] insertionSort(int[] nums){
        int partition = nums.length;
        for (int i = 1; i < partition; i++){
            int pos = nums[i];
            int index = i - 1;
            while(index>=0 && nums[index] > pos){
                nums[pos+1] = nums[index];
                pos--;

            }
            nums[pos + 1] = pos;
        }

        return nums;

    }

    public static void main(String[] args){
        int[] num = new int[4];
        num[0] = 1;
        num[1] = 3;
        num[2] = 2;
        num[3] = -5;
        for (int k = 0; k < num.length; k++){
            System.out.print(num[k]);
        }
    }
}
