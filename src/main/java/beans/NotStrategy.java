package beans;

import java.util.List;

public class NotStrategy {
    public int choose(List<Integer> chooseList) {
        System.out.println(getClass().getName() + " : In choose()");
        return 100;
    }
}
