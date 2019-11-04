import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        long StartTime, EndTime;
        System.out.println("Task 1: ");
        final int n = 10;
        int[] Arr = new int[n];
        int[] SortArr = new int[n];
        final int max = 100, min = 0;
        int diff = max - min;
        for(int i = 0; i < n; i++){
            Arr[i] = (int)(Math.random()*(diff+1)) + min;
        }
        System.out.println("Original Array: ");
        for(int i = 0; i < n; i++){
            System.out.printf(Arr[i] + " ");
        }
        System.out.println();
        {
            for(int i = 0; i < n; i++){
                SortArr[i] = Arr[i];
            }
            System.out.println();
            System.out.println("After buble sorting: ");
            StartTime = System.nanoTime();
            for(int i = 0; i < n; i++)
                for(int j = i+1; j < n; j++){
                    if(SortArr[i] > SortArr[j]){
                        int R = SortArr[i];
                        SortArr[i] = SortArr[j];
                        SortArr[j] = R;
                    }
                }
            EndTime = System.nanoTime();

            for(int i = 0; i < n; i++){
                System.out.printf(SortArr[i] + " ");
            }
            System.out.println();
            System.out.println("Bubble sorting lasted " + (EndTime - StartTime));

        }
        {
            for(int i = 0; i < n; i++){
                SortArr[i] = Arr[i];
            }
            System.out.println();
            System.out.println("After Arrays.sort(): ");
            StartTime = System.nanoTime();
            Arrays.sort(SortArr);
            EndTime = System.nanoTime();
            for(int i = 0; i < n; i++){
                System.out.printf(SortArr[i] + " ");
            }
            System.out.println();
            System.out.println("Arrays.sort() lasted " + (EndTime - StartTime));
        }
        {
            for(int i = 0; i < n; i++){
                SortArr[i] = Arr[i];
            }
            System.out.println();
            System.out.println("After sorting by choice: ");
            StartTime = System.nanoTime();
            for(int i = 0; i < n; i++){
                int imin = i;
                for(int j = i+1; j < n; j++){
                    if(SortArr[imin] > SortArr[j]){
                        imin = j;
                    }
                }
                int R = SortArr[i];
                SortArr[i] = SortArr[imin];
                SortArr[imin] = R;
            }

            EndTime = System.nanoTime();

            for(int i = 0; i < n; i++){
                System.out.printf(SortArr[i] + " ");
            }
            System.out.println();
            System.out.println("Sorting by choice lasted " + (EndTime - StartTime));

        }

        System.out.println();
        System.out.println("Task 2: ");

        final int calcfac = 12;
        int resultfac1 = 1;

        StartTime = System.nanoTime();
        for(int i = 1; i <=calcfac; i++) {
            resultfac1 *= i;
        }
        EndTime = System.nanoTime();

        System.out.println("a: ");
        System.out.println("Factorial of " + calcfac + " is " + resultfac1 + "(calculated by cycle)");
        System.out.println("Execution time of cycle process if " + (EndTime - StartTime));

        StartTime = System.nanoTime();
        int resultfac2 = CalculateFactorial(calcfac);
        EndTime = System.nanoTime();
        System.out.println("b: ");
        System.out.println("Factorial of " + calcfac + " is " + resultfac2 + "(calculated by recursion)");
        System.out.println("Execution time of recursion process if " + (EndTime - StartTime));

        System.out.println();
        System.out.println("Task 3: ");
        PrintHashtag();
        System.out.println();
        System.out.println("Task 4: ");
        SearchArray();
        System.out.println();
        System.out.println("Task 5: ");
        Matrix();
    }

    public static int CalculateFactorial(int calcfac) //task 1
    {
        if (calcfac == 0 || calcfac == 1) return 1;
        return calcfac*CalculateFactorial(calcfac - 1);
    }

    public static void PrintHashtag() //task 2
    {
        final int row = 5;
        final int col = 5;
        System.out.println("a: ");
        for(int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++) {
                System.out.printf("#");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("b: ");
        int TargetSize = 8;
        int size = 0;

        System.out.println("Picture A");
        do
        {
            size++;
            for (int i = 0; i < size; i++)
            {
                System.out.printf("#");
            }
            System.out.println();
        }while(size != TargetSize);

        System.out.println();
        System.out.println("Picture B");
        do
        {
            for (int i = 0; i < size; i++)
            {
                System.out.printf("#");
            }
            System.out.println();
            size--;
        }while(size != 0);

        System.out.println();
        System.out.println("Picture D");
        do
        {
            size++;
            for (int i = 0; i < TargetSize; i++)
            {
                if (i >= (TargetSize - size))System.out.printf("#");
                else System.out.printf(" ");
            }
            System.out.println();
        }while(size != TargetSize);

        System.out.println();
        System.out.println("Picture C");
        do
        {
            for (int i = 0; i < TargetSize; i++)
            {
                if (i >= (TargetSize - size))System.out.printf("#");
                else System.out.printf(" ");
            }
            System.out.println();
            size--;
        }while(size != 0);

        System.out.println();
        TargetSize = 7;
        System.out.println("Picture E");
        for (int i = 1; i <= TargetSize; i++)
        {
            for (int j = 1; j <= TargetSize; j++)
            {
                if (i == 1 || i == TargetSize || (i != 1 && i != TargetSize && (j == 1 || j == TargetSize))) System.out.printf("#");
                else System.out.printf(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Picture F");
        for (int i = 1; i <= TargetSize; i++)
        {
            for (int j = 1; j <= TargetSize; j++)
            {
                if (i == 1 || i == TargetSize || (i != 1 && i != TargetSize && i == j)) System.out.printf("#");
                else System.out.printf(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Picture G");
        for (int i = 1; i <= TargetSize; i++)
        {
            for (int j = 0; j < TargetSize; j++)
            {
                if (i == 1 || i == TargetSize || (i != 1 && i != TargetSize && i == (TargetSize - j))) System.out.printf("#");
                else System.out.printf(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Picture H");
        for (int i = 1; i <= TargetSize; i++)
        {
            for (int j = 1; j <= TargetSize; j++)
            {
                if (i == 1 || i == TargetSize || (i != 1 && i != TargetSize && (i == j || i == (TargetSize - j + 1)))) System.out.printf("#");
                else System.out.printf(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Picture I");
        for (int i = 1; i <= TargetSize; i++)
        {
            for (int j = 1; j <= TargetSize; j++)
            {
                if (i == 1 || i == TargetSize || (i != 1 && i != TargetSize && (i == j || i == (TargetSize - j + 1))|| (j == 1 || j == TargetSize))) System.out.printf("#");
                else System.out.printf(" ");
            }
            System.out.println();
        }
    }

    public static void SearchArray() //task 3
    {
        System.out.println();
        System.out.println("a: ");
        {
            int[] ArrayA = new int[50];

            int count = 0;
            for (int i = 0; i < 100; i++) {
                if (i % 2 != 0) {
                    ArrayA[count] = i;
                    if (count < 50) count++;
                }
            }

            for (int i = 0; i < 50; i++) {
                System.out.printf(ArrayA[i] + " ");
            }

            System.out.println();
            for (int i = 49; i >= 0; i--) {
                System.out.printf(ArrayA[i] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("b: ");
        {
            final Random GenRandb = new Random();

            int[] ArrayB = new int[20];

            int evencount = 0, oddcount = 0;

            for (int i = 0; i < 20; i++) {
                ArrayB[i] = GenRandb.nextInt(10);
                System.out.printf(ArrayB[i] + " ");
                if(ArrayB[i] != 0) {
                    if (ArrayB[i] % 2 == 0) evencount++;
                    else oddcount++;
                }
            }

            System.out.println();
            System.out.println("Count of even numbers is " + evencount);
            System.out.println("Count of odd numbers is " + oddcount);
        }

        System.out.println();
        System.out.println("c: ");
        {
            final Random GenRandc = new Random(1);

            int[] ArrayC = new int[10];

            for (int i = 0; i < 10; i++) {
                ArrayC[i] = GenRandc.nextInt(100);
                System.out.printf(ArrayC[i] + " ");
            }

            System.out.println();
            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {
                    ArrayC[i] = 0;
                }
                System.out.printf(ArrayC[i] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("d: ");
        {
            final int max = 50, min = -50;
            int diff = max - min;

            int[] ArrayD = new int[15];

            int imax = 0, imin = 0;
            for (int i = 0; i < 15; i++) {
                ArrayD[i] = (int)(Math.random()*(diff+1)) + min;
                System.out.printf(ArrayD[i] + " ");
                if(ArrayD[i] >= ArrayD[imax]) imax = i;
                if(ArrayD[i] <= ArrayD[imin]) imin = i;
            }

            System.out.println();
            System.out.println("Max element of array is " + ArrayD[imax] + "; " + (imax+1) + " is the last position");
            System.out.println("Min element of array is " + ArrayD[imin] + "; " + (imin+1) + " is the last position");

        }

        System.out.println();
        System.out.println("e: ");
        {
            final Random GenRande = new Random();

            int[] ArrayE1 = new int[10], ArrayE2 = new int[10];

            System.out.println("First array: ");
            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < 10; i++) {
                ArrayE1[i] = GenRande.nextInt(10);
                sum1 += ArrayE1[i];
                ArrayE2[i] = GenRande.nextInt(10);
                sum2 += ArrayE2[i];
                System.out.printf(ArrayE1[i] + " ");
            }

            System.out.println();
            System.out.println("Second array: ");

            for (int i = 0; i < 10; i++) {
                System.out.printf(ArrayE2[i] + " ");
            }

            System.out.println();

            if (sum1/10 > sum2/10) System.out.println("The arithmetic mean of the first array is greater than the second");
            else if (sum1/10 < sum2/10) System.out.println("The arithmetic mean of the first array is less than the second");
            else System.out.println("The arithmetic means of the first and second arrays are equal");
        }

        System.out.println();
        System.out.println("f: ");
        {
            final int max = 1, min = -1;
            int diff = max - min;

            int[] ArrayF = new int[20];

            int zerocount = 0, onecount = 0, monecount = 0;
            for (int i = 0; i < 20; i++) {
                ArrayF[i] = (int) (Math.random() * (diff+1)) + min;
                if (ArrayF[i] == 0) zerocount++;
                if (ArrayF[i] == 1) onecount++;
                if (ArrayF[i] == -1) monecount++;
                System.out.printf(ArrayF[i] + " ");
            }

            System.out.println();

            if ((zerocount > onecount)&&(zerocount > monecount)) System.out.println("The number 0 is more common than the others");
            else if ((onecount > zerocount)&&(onecount > monecount)) System.out.println("The number 1 is more common than the others");
            else if ((monecount > zerocount)&&(monecount > onecount)) System.out.println("The number -1 is more common than the others");
            else if ((zerocount == onecount)&&(zerocount > monecount)) System.out.println("The numbers 0 and 1 is more common than the others");
            else if ((zerocount == monecount)&&(zerocount > onecount)) System.out.println("The numbers 0 and -1 is more common than the others");
            else if ((onecount == monecount)&&(onecount > zerocount)) System.out.println("The numbers 1 and -1 is more common than the others");
            else if ((zerocount == onecount) && (zerocount == monecount)) System.out.println("The numbers 0, 1 and -1 occur in the array equally");
            System.out.println();
        }

    }

    public static void Matrix() //task 4
    {
        System.out.println();
        System.out.println("a: ");
        {
            int[][] MatrixA = new int[8][8];
            final int min = 1, max = 99;
            int diff = max - min;
            for(int i = 0; i < 8; i++){
                for(int j = 0; j < 8; j++){
                    MatrixA[i][j] = (int)(Math.random()*(diff+1)) + min;
                    System.out.printf(MatrixA[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            int summaind = 0, sumsided = 0;
            long prodmaind = 1,prodsided = 1;
            for(int i = 0; i < 8; i++){
                for(int j = 0; j < 8; j++){
                    if(i==j){
                        summaind+=MatrixA[i][j];
                        prodmaind*=MatrixA[i][j];
                    }
                    else if(i==7-j){
                        sumsided+=MatrixA[i][j];
                        prodsided*=MatrixA[i][j];
                    }
                }
            }
            System.out.println("Summ of numbers in main diagonal is " + summaind);
            System.out.println("Product of numbers in main diagonal is " + prodmaind);
            System.out.println("Summ of numbers in side diagonal is " + sumsided);
            System.out.println("Product of numbers in side diagonal is " + prodsided);
        }

        System.out.println();
        System.out.println("b: ");
        {
            int[][] MatrixB = new int[8][5];
            final int min = -99, max = 99;
            int diff = max - min;
            int[] iMaxInRow = new int[8], iMaxInCol = new int[5];
            for(int i = 0; i < 8; i++){
                for(int j = 0; j < 5; j++){
                    MatrixB[i][j] = (int)(Math.random()*(diff+1)) + min;
                    System.out.printf(MatrixB[i][j]+" ");
                    if(MatrixB[i][j] > MatrixB[i][iMaxInRow[i]]){
                        iMaxInRow[i] = j;
                    }
                    if(MatrixB[i][j] > MatrixB[iMaxInCol[j]][j]){
                        iMaxInCol[j] = i;
                    }
                }

                System.out.println();
            }
            System.out.println();

            System.out.println("Max numbers in rows: ");
            for(int i = 0; i < 8; i++){
                System.out.println(i + ": " + MatrixB[i][iMaxInRow[i]] + " on " + iMaxInRow[i] + " position");
            }
            System.out.println();
            System.out.println("Max numbers in columns: ");
            for(int i = 0; i < 5; i++){
                System.out.println(i + ": " + MatrixB[iMaxInCol[i]][i] + " on " + iMaxInCol[i] + " position");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("c: ");
        {
            int[][] MatrixC = new int[8][5];
            final int min = -10, max = 10;
            int diff = max - min;
            int imax = 0;
            long maxprod = 1;
            for(int i = 0; i < 8; i++) {
                long ProdInRow = 1;
                for (int j = 0; j < 5; j++) {
                    MatrixC[i][j] = (int) (Math.random() * (diff + 1)) + min;
                    System.out.printf(MatrixC[i][j] + " ");
                    ProdInRow *= Math.abs(MatrixC[i][j]);
                    if(ProdInRow > maxprod){
                        maxprod = ProdInRow;
                        imax = i;
                    }
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("The max absolute product is in " + imax + " row");
            System.out.println();
        }

        System.out.println();
        System.out.println("d: ");
        {
            int[][] MatrixD = new int[10][7];

            final int min = 0, max = 100;
            int diff = max - min;
            for(int i = 0; i < 10; i++) {
                for (int j = 0; j < 7; j++) {
                    MatrixD[i][j] = (int) (Math.random() * (diff + 1)) + min;
                    System.out.printf(MatrixD[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();
            System.out.println("Result: ");
            for(int i = 0; i < 10; i++){
                int[] IntermArray = new int[7];
                int term;
                for(int j = 0; j < 7; j++) {
                    IntermArray[j] = MatrixD[i][j];
                }
                for (int j = 6; j >= 0; --j) {
                    for (int k = 0; k < j; k++) {
                        if (IntermArray[k] < IntermArray[k + 1]) {
                            term = IntermArray[k];
                            IntermArray[k] = IntermArray[k + 1];
                            IntermArray[k + 1] = term;
                        }
                    }
                }
                for(int j = 0; j < 7; j++) {
                    System.out.printf(IntermArray[j]+ " ");
                }
                System.out.println();
            }
        }
    }
}
