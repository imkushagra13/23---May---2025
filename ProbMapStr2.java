public class ProbMapStr2 {
    static String palindromic(String s1,String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        int len = dp[n][m];
        int i = n;
        int j = m;
        int idx = len - 1;
        String str = "";
        for (int k = 1; k <= len; k++) {
            str += "$";
        }
        StringBuilder sb = new StringBuilder(s1);
        StringBuilder str2 = new StringBuilder(str);
        while (i > 0 && j > 0) {
            if (sb.charAt(i - 1) == s2.charAt(j - 1)) {
                str2.setCharAt(idx, sb.charAt(i - 1));
                idx--;
                i--;
                j--;
            } else if (sb.charAt(i - 1) > s2.charAt(j - 1)) {
                i--;
            } else {
                j--;
            }
        }
        return str2.toString();
    }

    public static void main(String[] args) {
        String s="babad";
        String rev=new StringBuilder(s).reverse().toString();
            System.out.println(palindromic(s,rev));

    }
}
