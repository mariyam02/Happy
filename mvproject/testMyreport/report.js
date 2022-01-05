$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Saira Maryam/HRO/Eclipse Testing/mvproject/src/main/java/com/qa/features/crm.feature");
formatter.feature({
  "line": 1,
  "name": "HRO application test",
  "description": "",
  "id": "hro-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Validate Application  Page",
  "description": "",
  "id": "hro-application-test;validate-application--page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user is on loginpage",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "user logs into app",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "validate title of the homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters the apply leave page",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 7356694100,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.user_is_on_loginpage()"
});
formatter.result({
  "duration": 89414600,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.user_logs_into_app()"
});
formatter.result({
  "duration": 2054630600,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.validate_title_of_the_homepage()"
});
formatter.result({
  "duration": 8097200,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.user_enters_the_apply_leave_page()"
});
formatter.result({
  "duration": 14294609700,
  "error_message": "org.openqa.selenium.support.ui.UnexpectedTagNameException: Element should have been \"select\" but was \"label\"\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PG-TZ-IN-RLP-12\u0027, ip: \u0027192.168.1.28\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.\u003cinit\u003e(Select.java:48)\r\n\tat com.qa.pages.LeavePage.applyleave(LeavePage.java:42)\r\n\tat com.qa.stepdefintions.HomepageSteps.user_enters_the_apply_leave_page(HomepageSteps.java:51)\r\n\tat ✽.And user enters the apply leave page(C:/Saira Maryam/HRO/Eclipse Testing/mvproject/src/main/java/com/qa/features/crm.feature:7)\r\n",
  "status": "failed"
});
});