package test.hacker.math.fraudulentActivityNotifications;

import java.util.List;
import java.util.stream.Collectors;

public class Result {

    public static int activityNotifications(List<Integer> expenditure, int d) {
        int notification = 0;
        int lpc = expenditure.size() - d;

        for (int i = 0; i < lpc ; i++) {
            List<Integer> sList = expenditure.subList(i, i + d);
            notification += findNotification(sList, expenditure.get(i + d));
        }

        return notification;
    }

    private static int findNotification(List<Integer> sList, Integer checkValue) {
        List<Integer> srtList = sList.stream().sorted().collect(Collectors.toList());
        int mid = srtList.size() / 2;
        int median = srtList.size() % 2 == 0 ? srtList.get(mid) : (srtList.get(mid) + srtList.get(mid + 1)) / 2;
        if(checkValue >= 2 * median){
            return 1;
        }else{
            return 0;
        }
    }

}
