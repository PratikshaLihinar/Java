public class GfgLcmGcd {

        public static int[] lcmAndGcd(int a, int b) {
            int gcd = gcd(a, b);
            int lcm = (a * b) / gcd;


            return new int[]{lcm, gcd};
        }
        private static int gcd(int x, int y) {
            while (y != 0) {
                int temp = y;
                y = x % y;
                x = temp;
            }
            return x;
        }
}
