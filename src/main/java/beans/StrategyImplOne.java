package beans;

import java.util.List;

public class StrategyImplOne implements Strategy {
    public int choose(List<Integer> chooseList) {
        System.out.println(getClass().getName() + " : In choose()");
        return 1;
    }

    public void doSomethingElse() {
        System.out.println(getClass().getName() + " : Do something");
    }
}
