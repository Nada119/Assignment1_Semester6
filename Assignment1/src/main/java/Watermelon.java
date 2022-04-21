
public class Watermelon {
        public String Func (int input)
        {
            int w;
            w = input;
            if (w >= 1 && w <= 100)
            {
                if (w % 2 == 0 && w != 2)
                    return "Yes";
                else
                    return "No";
            }
            else
                return "Input is out of the Boundary";
        }
}
