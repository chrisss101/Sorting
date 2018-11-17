package Running;
import methods.inPlaceSorts;

public class Runner {

    public static void main(String[] args) {
        int[] displayedd = new int[7];
        displayedd[0] = 17;
        displayedd[1] = 20;
        displayedd[2] = 9;
        displayedd[3] = 18;
        displayedd[4] = 25;
        displayedd[5] = 22;
        displayedd[6] = 19;
        System.out.println(displayedd[0] + " " + displayedd[1] + " " + displayedd[2] + " " + displayedd[3] + " " + displayedd[4] + " "  + displayedd[5] + " " + displayedd[6] );
        inPlaceSorts.InsertionSort(displayedd);
        System.out.println(displayedd[0] + " " + displayedd[1] + " " + displayedd[2] + " " + displayedd[3] + " " + displayedd[4] + " "  + displayedd[5] + " " + displayedd[6] );
    }

}
