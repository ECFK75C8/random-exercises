import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayC {
    public static void main(String[] arg) {
        System.out.println(packArray(Arrays.asList(1,2,3,4,5,6,7,8)));
    }

    public static Integer packArray( List<Integer> arr ) {
        int numOfIter = (int) (Math.log(arr.size()) / Math.log(2));

        for (int i = 0; i < numOfIter; i++) {
            ArrayList newArray = new ArrayList();

        }

        return numOfIter;
    }
}
