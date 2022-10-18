package steps_sales;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class RetryTC implements IRetryAnalyzer,IAnnotationTransformer{

	public boolean retry(ITestResult result) {
		int count=0;
		int max=2;
		if(!result.isSuccess()&& count>max)
		{
		count++;
		return true;
		}
		
		return false;
		
	}
	public void transform(
		      ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		    annotation.setRetryAnalyzer(RetryTC.class);
		  }

}
