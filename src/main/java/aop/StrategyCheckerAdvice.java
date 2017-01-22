package aop;

import org.aspectj.lang.JoinPoint;

import java.util.List;

public class StrategyCheckerAdvice {
    private static int MAX_CHOOSE_VAL = 15;
    private static int MAX_RET_VAL = 50;
    public void before(JoinPoint joinPoint) {
        for (Integer i : (List<Integer>) joinPoint.getArgs()[0]) {
            if (i > MAX_CHOOSE_VAL)
                throw new IllegalArgumentException("Max value of choose is " + MAX_CHOOSE_VAL);
        }
    }

    public void afterReturning(Object retVal) throws Throwable {
        if ((Integer)retVal > MAX_RET_VAL)
            throw new IllegalArgumentException("Max ret val is " + MAX_RET_VAL);
    }
}
