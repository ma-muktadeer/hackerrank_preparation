package test.hacker.math.fraudulentActivityNotifications;

import java.util.List;

public class Result {

    public static int activityNotifications(List<Integer> expenditure, int d) {
        int notifications = 0;
        int[] count = new int[expenditure.stream().max(Integer::compareTo).get() + 1];

        for (int i = 0; i < d; i++) {
            count[expenditure.get(i)]++;
        }

        for (int i = d; i < expenditure.size(); i++) {
            double median = getMedian(count, d);

            if (expenditure.get(i) >= 2 * median) {
                notifications++;
            }

            count[expenditure.get(i - d)]--;
            count[expenditure.get(i)]++;
        }

        return notifications;
    }

    private static double getMedian(int[] count, int d) {
        int sum = 0;
        int mid1 = -1, mid2 = -1;
        boolean even = d % 2 == 0;
        int mid = d / 2;

        for (int i = 0; i < count.length; i++) {
            sum += count[i];

            if (even) {
                if (mid1 == -1 && sum >= mid)
                    mid1 = i;
                if (mid2 == -1 && sum >= mid + 1) {
                    mid2 = i;
                    return (mid1 + mid2) / 2.0;
                }
            } else {
                if (sum > mid)
                    return i;
            }
        }
        return 0;
    }

}
