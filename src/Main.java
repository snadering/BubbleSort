public class Main {
    public static void main(String[] args) {
        int[] arr = {44, 145, 3, 51, 6, 87, 123, 94, 25, 12, 11, 101};

        //Bubble sort
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
        }
        for (int nums : arr){
            System.out.print(nums + ", ");
        }
    }
}