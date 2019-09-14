$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/javafeature/Amezon.feature");
formatter.feature({
  "line": 1,
  "name": "Amezon Feature",
  "description": "",
  "id": "amezon-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 138694264,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User should able to login in Amezon",
  "description": "",
  "id": "amezon-feature;user-should-able-to-login-in-amezon",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@AmezonLogin"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user is able open amezon",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user click sign button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user enter email",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user enter password",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "userclick on login button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user click on amezon search button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "success message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStep.user_is_able_open_amezon()"
});
formatter.result({
  "duration": 1410881666,
  "error_message": "java.lang.NoClassDefFoundError: com/google/common/base/Function\r\n\tat seleniumgluecode.TestStep.user_is_able_open_amezon(TestStep.java:93)\r\n\tat ✽.Given user is able open amezon(src/test/java/javafeature/Amezon.feature:18)\r\nCaused by: java.lang.ClassNotFoundException: com.google.common.base.Function\r\n\tat java.net.URLClassLoader.findClass(Unknown Source)\r\n\tat java.lang.ClassLoader.loadClass(Unknown Source)\r\n\tat sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)\r\n\tat java.lang.ClassLoader.loadClass(Unknown Source)\r\n\tat seleniumgluecode.TestStep.user_is_able_open_amezon(TestStep.java:93)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat CucumberDemo.CucumberDemo.TestRunner.feature(TestRunner.java:67)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:583)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:719)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:989)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\r\n\tat org.testng.TestRunner.run(TestRunner.java:505)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\r\n\tat org.testng.TestNG.run(TestNG.java:1017)\r\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:114)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:251)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:77)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestStep.user_click_sign_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestStep.user_enter_email()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestStep.user_enter_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestStep.userclick_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "TestStep.success_message_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
});