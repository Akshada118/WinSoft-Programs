//Q2:Find maximum sum path involving elements of given arrays
//Given two sorted arrays of integers, find a maximum sum path involving elements of both arrays whose sum is maximum. 
//We can start from either array, but we can switch between arrays only through its common elements.

public class MaximumSumPath {
    public static void main(String[] args) 
    {
        int[] X = {3, 9, 10, 11, 12, 13, 14, 15, 16,19,90,45,88};
        int[] Y = {1, 3, 5, 7, 8, 9, 10, 11, 19, 20, 21, 23, 25,45,59};

        int maxSum = findMaximumSumPath(X, Y);
        System.out.println("The maximum sum path is: " + maxSum);
    }

    public static int findMaximumSumPath(int[] X, int[] Y) 
    {
        int i = 0, j = 0;
        int m = X.length, n = Y.length;
        int sumX = 0, sumY = 0;
        int result = 0;

        while (i < m && j < n) 
        {
            if (X[i] < Y[j]) 
            {
                sumX += X[i++];
            } else if (X[i] > Y[j]) 
            {
                sumY += Y[j++];
            } else 
            {
                result += Math.max(sumX, sumY) + X[i];
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
        }
        while (i < m) 
        {
            sumX += X[i++];
        }

        while (j < n) 
        {
            sumY += Y[j++];
        }
        result += Math.max(sumX, sumY);

        return result;
    }
}

