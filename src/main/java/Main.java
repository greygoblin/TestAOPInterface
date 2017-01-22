import beans.*;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring.xml");
        ctx.refresh();

        StrategyImplOne strategy1 = (StrategyImplOne) ctx.getBean("strategy1");
        StrategyImplOneHundred strategy2 = ctx.getBean("strategy2", StrategyImplOneHundred.class);
        NotStrategy notStrategy = (NotStrategy) ctx.getBean("notStrategy");

        List<Integer> wrongList = new ArrayList<Integer>();
        wrongList.add(10);
        wrongList.add(20);

        List<Integer> correctList = new ArrayList<Integer>();
        correctList.add(5);
        correctList.add(10);


        strategy1.doSomethingElse();
        strategy2.doSomethingElse();
        notStrategy.choose(wrongList);
        try {
            strategy1.choose(wrongList);
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        try {
            strategy2.choose(wrongList);
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Ret val of StrategyImplOne : " + strategy1.choose(correctList));
        try {
            System.out.println("Ret val of StrategyImplOneHundred : " + strategy2.choose(correctList));
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

    }
}
