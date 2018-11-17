package methods;

public class inPlaceSorts {
    public static void BubbleSort(int[] arr ) {
        Boolean swappable = true;
        int place = 0;
        while (swappable == true) {
            boolean swapped = false;
            for (int i = 0; i < arr.length - 1; i++ ) {
                if (arr[i] > arr[i+1]) {
                    swapped = true;
                    place = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = place;
                }
            }
            if (!swapped) {
                swappable = false;
            }
        }
    }
    public static void InsertionSort(int[] arr ) {

        for (int i = 1; i < arr.length;i++) {
            if (arr[i-1] > arr[i]) {
                //int min = arr[i];
                for (int j = i; j > 0;j--) {

                    if ( arr[j-1] > arr[j]) {
                        int place = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = place;
                    }
                }
            }


        }
    }
    public static void SelectionSort(int[] arr ) {
        int place = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            place = i;
            for (int j = place; j < arr.length; j++) {
                min = place;
                if (arr[j] < arr[i]) {
                    min = j;
                }
                int hold = arr[min];
                arr[min] = arr[i];
                arr[i] = hold;
            }
        }
    }
}
