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
}
