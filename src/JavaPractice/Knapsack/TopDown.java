package JavaPractice.Knapsack;

public class TopDown {
    static int max(int a, int b)
        {
            return (a > b) ? a : b;
        }
        static int knapSack(int bag, int weight[],int value[], int arraysize) {
            int K[][] = new int[arraysize + 1][bag+ 1];
            int i ,j;
            for (i = 0; i <= arraysize; i++)
            {
                for (j= 0; j <= bag; j++)
                {
                    if (i == 0 || j == 0)
                        K[i][j] = 0;
                    else if (weight[i - 1] <= bag)
                        K[i][bag] = max(value[i - 1]+ K[i - 1][j - weight[i - 1]],K[i - 1][j]);
                    else
                        K[i][j] = K[i - 1][j];
                }
            }

            return K[arraysize][bag];
        }
        public static void main(String args[])
        {
            int value[] = new int[] { 60, 100, 120 };
            int weight[] = new int[] { 10, 20, 30 };
            int bag= 50;
            int arraysize = value.length;
            System.out.println(knapSack(bag,weight,value,arraysize));
        }
    }

