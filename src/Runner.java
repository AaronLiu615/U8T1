import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        /* String[][] seats = {{"Abby", "Don", "George", "Kim"},
                            {"Brian", "Elenor","Harry","Lenny"},
                            {"Cathy","Fred","Jill","Matt"}};
        for (String[] printing : seats){
            System.out.print(Arrays.toString(printing));
            System.out.println();
        }
        seats[1][2] = "Paul";
        for (String[] printing : seats){
            System.out.print(Arrays.toString(printing));
            System.out.println();
        }
        String temp = seats[0][0];
        seats[0][0] = seats[2][3];
        seats[2][3] = temp;
        for (String[] printing : seats){
            System.out.print(Arrays.toString(printing));
            System.out.println();
        }
        String[] tempRow = seats[0];
        seats[0] = seats[1];
        seats[1] = tempRow;
        for (String[] printing : seats){
            System.out.print(Arrays.toString(printing));
            System.out.println();
        }

        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        for (int[] list : arr1){
            System.out.print(Arrays.toString(list));
            System.out.println();
        }

        arr2[0][0] = 1;
        arr2[0][1] = 4;
        arr2[1][0] = 2;
        arr2[1][1] = 5;
        arr2[2][0] = 3;
        arr2[2][1] = 6;

        for (int[] list : arr2){
            System.out.print(Arrays.toString(list));
            System.out.println();
        } */
        //int[][] arry1 = {{1, 2, 3}, {6, 5, 4}};

        //System.out.print(FunWith2DArrays.totalElments(arry1));

        /* String[][] words = {{"hi", "bye", "stuff", "go"},
                            {"time", "up", "you", "good"},
                            {"map", "low", "bow", "mom"}};
        FunWith2DArrays.fourCorners(words);

        String[][] words2 = {{"time", "up", "bye"},
                {"hi", "hit", "up"},
                {"map", "bam", "low"},
                {"bow", "mom", "joy"}};

        FunWith2DArrays.fourCorners(words2);

        String[][] words3 = {{"phone", "mouse", "keyboard"}};

        FunWith2DArrays.fourCorners(words3);

        String[][] words4 = {{"cat"},
                {"dog"},
                {"hamster"},
                {"bird"}};

        FunWith2DArrays.fourCorners(words4);

        String[][] words5 = {{"time"}};

        FunWith2DArrays.fourCorners(words5); */

        // TEST CODE FOR average
        int[][] testArr1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(FunWith2DArrays.average(testArr1));
        int[][] testArr2 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(FunWith2DArrays.average(testArr2));
        int[][] testArr3 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(FunWith2DArrays.average(testArr3));
        int[][] testArr4 = {{4}, {7}, {8}, {2}};
        System.out.println(FunWith2DArrays.average(testArr4));
        int[][] testArr5 = {{4}};
        System.out.println(FunWith2DArrays.average(testArr5));

        // TEST CODE FOR indexFound
        String[][] words = {{"hi", "bye", "stuff", "go"}, {"time", "up", "you", "good"}, {"map", "low", "bow", "mom"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "stuff")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "good")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "map")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "cat")));
        System.out.println("--------------");

        String[][] words2 = {{"time", "up", "bye"}, {"hi", "hit", "up"}, {"map", "bam", "low"}, {"bow", "mom", "joy"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "time")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "joy")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "bam")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "cat")));




    }
}
