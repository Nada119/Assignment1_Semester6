public class Young_Physicist {
    public String Func(int input_n, int[] input_x, int[] input_y, int[] input_z) {
        int[] x, y, z;
        int n, sum1 = 0, sum2 = 0, sum3 = 0;
        n = input_n;
        x = input_x;
        y = input_y;
        z = input_z;
        if (n >= 1 && n <= 100)
        {

            for (int i = 0; i < n; i++)
            {
                if ((x[i] >= -100 && y[i] >= -100 && z[i] >= -100) && (x[i] <= 100 && y[i] <= 100 && z[i] <= 100))
                {
                    sum1 += x[i];
                    sum2 += y[i];
                    sum3 += z[i];
                }
                else
                {
                    return "The Coordinates are out of the boundary";
                }
            }
            if (sum1 == 0 && sum2 == 0 && sum3 == 0)
            {
                return "Yes";
            }
            else
            {
                return "No";
            }
        }
        else
        {
            return "N is out of the boundary";
        }
    }
}
