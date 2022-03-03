import java.util.ArrayList;
import java.util.Arrays;

public class FunWith2DArrays {

    public static int totalElments(int[][] array){
        int rows = array.length;
        int columns = array[0].length;
        return rows * columns;
    }

    public static void fourCorners(String[][] array){

        int row = array.length - 1;
        int columns = array[0].length - 1;

        if (array.length == 0)
        {
            row = 0;
        }
        if (array[0].length == 0){
            columns = 0;
        }

        System.out.print(array[0][0]);
        System.out.println();
        System.out.print(array[0][columns]);
        System.out.println();
        System.out.print(array[row][0]);
        System.out.println();
        System.out.print(array[row][columns]);
        System.out.println();
    }

    public static double average(int[][] list){
        int number = list.length * list[0].length;
        double sum = 0;
        for (int[] list1 : list){
            for (int list2 : list1)
            {
                sum += list2;
            }
        }
        return sum/number;
    }

    public static int[] indexFound(String[][] list, String target){
        int[] index = new int[2];
        for (int i = 0 ; i < list.length ; i++){
            for (int x = 0; x < list[0].length; x++){
                if (list[i][x].equals(target))
                {
                    index[0] = i;
                    index[1] = x;
                    return index;
                }
            }
        }
        index[0] = -1;
        index[1] = -1;
        return index;
    }
}
