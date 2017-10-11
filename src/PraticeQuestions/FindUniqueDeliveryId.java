package PraticeQuestions;

/**
 * Created by JohnNoriega22 on 10/8/17.
 */
public class FindUniqueDeliveryId {
    // given an array of ids which contains many duplicate integers and one unique integer find th unique integer
    public static int findUnique(int[] deliveryIds) {
        int uniqueDeliveryId =0;
        for (int i =0; i < deliveryIds.length; i++) {
            uniqueDeliveryId ^= deliveryIds[i];
        }
        return uniqueDeliveryId;
    }// complexity time: o(n) space: o(1)
}
