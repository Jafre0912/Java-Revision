public class MaxLength {
    public int maxLength(int[] nums) {
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            int prod = 1;
            int  gcd = nums[i];
            int lcm = nums[i];
            
            for (int j = i; j < nums.length; j++) {
                prod *= nums[j];
                gcd = gcd(gcd, nums[j]);
                lcm = (lcm * nums[j]) / gcd(gcd, nums[j]);

                if (prod == lcm * gcd) {
                    maxLen = Math.max(maxLen, j - i + 1);
                } else {
                    break;
                }
            }
        }
        return maxLen;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    public static void main(String[] args) {
        MaxLength s3 = new MaxLength();
        s3.gcd(1, 2);
    }
}

