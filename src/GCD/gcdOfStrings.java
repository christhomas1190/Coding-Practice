package GCD;

    public String gcdOfStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        String result = "";

        for (int i = 1; i <= minLength; i++) {
            if (str1.length() % i == 0 && str2.length() % i == 0) {
                String candidate = str1.substring(0, i);
                boolean isValidForStr1 = true;
                for (int j = 0; j < str1.length(); j += candidate.length()) {
                    if (!str1.substring(j, j + candidate.length()).equals(candidate)) {
                        isValidForStr1 = false;
                        break;
                    }
                }
            }
        }
    }

