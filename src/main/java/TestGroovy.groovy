import com.eviware.soapui.model.testsuite.TestCaseRunner
import com.eviware.soapui.model.testsuite.TestRunContext

class Test {

    public void testGroovy(TestRunContext testRunContext, TestCaseRunner testRunner) {

        testSuiteRunner.testSuite.testCaseList[0].testStepList[0].getPropertyValue("")

        log.info testRunner.testCase.testStepList[0].getPropertyValue("propertyTest")

        testRunner.testCase.testSteps['PropertiesStep'].setPropertyValue("propertyTest", '255000')

        log.info testRunner.testCase.testSteps['PropertiesStep'].getPropertyValue("propertyTest")

    }
}