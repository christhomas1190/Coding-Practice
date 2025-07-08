package GCD;

class GreatestCommonDenom {
    public String gcdOfStrings (String str1, String str2){
        // If str1 + str2 is not equal to str2 + str1, there is no common divisor string
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find the greatest common divisor of the lengths of str1 and str2
        int gcdLength = findGCD(str1.length(), str2.length());

        // The GCD string will be the prefix of str1 with length equal to the GCD
        return str1.substring(0, gcdLength);
    }

// Helper method to compute the greatest common divisor using Euclidean algorithm
    private int findGCD ( int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
