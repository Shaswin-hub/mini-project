$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Adactin.feature");
formatter.feature({
  "name": "To validate login to adactin hotel link",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate valid username and valid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Launch the edge browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinStepDefinition.launch_the_edge_browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter valid username in username field",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDefinition.enter_valid_username_in_username_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter valid password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefinition.enter_valid_password_in_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefinition.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the location in location field",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefinition.select_the_location_in_location_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select hotel in hotel field",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefinition.select_hotel_in_hotel_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select room in room field",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefinition.select_room_in_room_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefinition.click_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the hotel",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefinition.select_the_hotel()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#radiobutton_4\"}\n  (Session info: MicrosoftEdge\u003d129.0.2792.52)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.24.0\u0027, revision: \u0027748ffc9bc3\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.22\u0027\nDriver info: org.openqa.selenium.edge.EdgeDriver\nCommand: [c05a9681b14eaab299e3524da3aa0dfe, findElement {value\u003dradiobutton_4, using\u003did}]\nCapabilities {acceptInsecureCerts: false, browserName: MicrosoftEdge, browserVersion: 129.0.2792.52, fedcm:accounts: true, ms:edgeOptions: {debuggerAddress: localhost:51741}, msedge: {msedgedriverVersion: 129.0.2792.52 (6462e8fc16ec..., userDataDir: C:\\Users\\CALWIN\\AppData\\Loc...}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:51741/devtoo..., se:cdpVersion: 129.0.2792.52, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: c05a9681b14eaab299e3524da3aa0dfe\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.ErrorCodec.decode(ErrorCodec.java:167)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:138)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:50)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:190)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:216)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:174)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:68)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat org.mvn.BaseClass.buttonClick(BaseClass.java:61)\r\n\tat org.stepdefinition.AdactinStepDefinition.select_the_hotel(AdactinStepDefinition.java:61)\r\n\tat ✽.Select the hotel(src/test/resources/Feature/Adactin.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Click continew button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefinition.click_continew_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close the edge browser",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.close_the_edge_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("src/test/resources/Feature/amazon.feature");
formatter.feature({
  "name": "To valid signin function of amazon application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "Validate valide username and valide password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Launch edge browser and hit the amazon url",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonSignIn.launch_edge_browser_and_hit_the_amazon_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To send the username or mobile number in email field",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonSignIn.to_send_the_username_or_mobile_number_in_email_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click continue button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonSignIn.to_click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To send password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonSignIn.to_send_password_in_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the signin button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonSignIn.to_click_the_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the amazon page browser",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonSignIn.to_close_the_amazon_page_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/Feature/fb.feature");
formatter.feature({
  "name": "To validate login in facebook application",
  "description": "Given To launch the edge browser and hit the url",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@feature1"
    }
  ]
});
formatter.scenario({
  "name": "To validate invalid username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "To launch the edge browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "FbDefine.to_launch_the_edge_browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter the invalid username in email field",
  "keyword": "When "
});
formatter.match({
  "location": "FbDefine.to_enter_the_invalid_username_in_email_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter invalid password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "FbDefine.to_enter_invalid_password_in_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbDefine.to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the edge browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FbDefine.to_close_the_edge_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate valid username and password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "launch the edge browser and hit the url",
  "keyword": "Given "
});
formatter.step({
  "name": "enter the invalid username \"\u003cemailfield\u003e\" in email field",
  "keyword": "When "
});
formatter.step({
  "name": "enter invalid password \"\u003cpasswordfield\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.step({
  "name": "close the edge browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emailfield",
        "passwordfield"
      ]
    },
    {
      "cells": [
        "abc@gmail.com",
        "1245698"
      ]
    },
    {
      "cells": [
        "fgddg@gmailcom",
        "25896"
      ]
    },
    {
      "cells": [
        "atob@gmail.com",
        "25896"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate valid username and password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "launch the edge browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "BulkOff.launch_the_edge_browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the invalid username \"abc@gmail.com\" in email field",
  "keyword": "When "
});
formatter.match({
  "location": "BulkOff.enter_the_invalid_username_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter invalid password \"1245698\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "BulkOff.enter_invalid_password_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "BulkOff.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the edge browser",
  "keyword": "Then "
});
formatter.match({
  "location": "BulkOff.close_the_edge_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate valid username and password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "launch the edge browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "BulkOff.launch_the_edge_browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the invalid username \"fgddg@gmailcom\" in email field",
  "keyword": "When "
});
formatter.match({
  "location": "BulkOff.enter_the_invalid_username_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter invalid password \"25896\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "BulkOff.enter_invalid_password_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "BulkOff.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the edge browser",
  "keyword": "Then "
});
formatter.match({
  "location": "BulkOff.close_the_edge_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate valid username and password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "launch the edge browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "BulkOff.launch_the_edge_browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the invalid username \"atob@gmail.com\" in email field",
  "keyword": "When "
});
formatter.match({
  "location": "BulkOff.enter_the_invalid_username_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter invalid password \"25896\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "BulkOff.enter_invalid_password_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "BulkOff.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the edge browser",
  "keyword": "Then "
});
formatter.match({
  "location": "BulkOff.close_the_edge_browser()"
});
formatter.result({
  "status": "passed"
});
});