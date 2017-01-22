package beans;

public class MyDep {
    StrategyImplOne one;
    StrategyImplOneHundred two;

    public void setOne(StrategyImplOne one) {
        this.one = one;
    }

    public void setTwo(StrategyImplOneHundred two) {
        this.two = two;
    }

    public void doIt() {
        one.doSomethingElse();
        two.doSomethingElse();
    }
}
