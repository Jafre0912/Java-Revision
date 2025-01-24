class Solution{
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }  
    public static void main(String[] args) {
        Solution s2 = new Solution();
        System.out.println(s2.addDigits(10));
    }
}


