$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/eclipse-jee-neon-3-win32-x86_64/SELENIUM/cucumberFramworkBDD/src/main/java/Feature/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Offline Website Login",
  "description": "",
  "id": "offline-website-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Offline Website Login Test",
  "description": "",
  "id": "offline-website-login;offline-website-login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User Is Already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Tital Of Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Enters UserName and User Enter Password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click the log in button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Is On Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_Is_Already_on_Login_Page()"
});
formatter.result({
  "duration": 38591687905,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.tital_Of_Login_Page()"
});
formatter.result({
  "duration": 77872998,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.User_Enters_UserName_and_User_Enter_Password()"
});
formatter.result({
  "duration": 1175286658,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.click_the_log_in_button()"
});
formatter.result({
  "duration": 3033946848,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.User_Is_On_Home_Page()"
});
formatter.result({
  "duration": 12490949,
  "status": "passed"
});
});