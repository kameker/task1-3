package vgu.dz.seventh;

public class seventh {

    public static int solution(int[] arr, int n) {
        int maxCount = 0;
        int outIndex = -1;
        for (int i = 0; i <= arr.length - n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < i + n; j++) {
                sb.append(arr[j]);
            }
            int count = 1;
            for (int k = i + n; k <= arr.length - n; k++) {
                StringBuilder sb2 = new StringBuilder();
                for (int l = k; l < k + n; l++) {
                    sb2.append(arr[l]);
                }
                if (sb.toString().equals(sb2.toString())) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                outIndex = i;
            }
        }

        return outIndex;
    }
}