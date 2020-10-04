class Solution {

    public int solution(int[] A) {
        int result;
        Arrays.sort(A);
        int max = A[A.length - 1];
        if (max > 0) {
            int notHaveNum = 0;
            for (int i = 1; i <= max; i++) {
                if (!checkHaveNum(A, i)) {
                    if (notHaveNum == 0) {
                        notHaveNum = i;
                    }
                    notHaveNum = notHaveNum < i ? notHaveNum : i;
                }
            }
            if (notHaveNum == 0) {
                notHaveNum = max + 1;
            }
            result = notHaveNum;
        } else {
            result = 1;
        }
        return result;
    }

    public boolean checkHaveNum(int[] A, int num) {
        boolean isHave = false;
        for (int i = 0; i < A.length; i++) {
            if (num == A[i]) {
                isHave = true;
            }
        }
        return isHave;
    }
}