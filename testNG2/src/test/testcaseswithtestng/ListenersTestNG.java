
package testcaseswithtestng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenersTestNG implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed : " + result.getName() + " Taking Screenshot !");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("***************Test case passed***************" + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("***************Class Instantiated***************");
    }

    // public void onFinish(ITestContext context) {
    // System.out.println("onFinish method started");
    // }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("***************Test Started***************");
    }
}

// public void onTestSkipped(ITestResult result) {
// System.out.println("onTestSkipped Method" +result.getName());
// }

// public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
// System.out.println("onTestFailedButWithinSuccessPercentage" +result.getName());
// }

