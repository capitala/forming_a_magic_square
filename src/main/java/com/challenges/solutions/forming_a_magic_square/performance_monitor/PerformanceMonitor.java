package com.challenges.solutions.forming_a_magic_square.performance_monitor;



import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class PerformanceMonitor {

	@Around("@annotation(TrackTime)")
	public Object around(ProceedingJoinPoint joinPoint) {
		long startTime = System.currentTimeMillis();
		Object value = null;
		try {
			value=joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		long timeTaken = System.currentTimeMillis() - startTime;
		System.out.println("Time Taken by {} is {}"+ joinPoint+ timeTaken);
		return value;
	}

	
}
