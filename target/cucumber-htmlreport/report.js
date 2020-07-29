$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("01NewtoursRegister.feature");
formatter.feature({
  "line": 2,
  "name": "Users ability to create account",
  "description": "",
  "id": "users-ability-to-create-account",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@newtour"
    },
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User should able to create account using Register",
  "description": "",
  "id": "users-ability-to-create-account;user-should-able-to-create-account-using-register",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Browse to Newtours homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Navigate to Register page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Fill form with some basic information",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Complete creating account with \"\u003cUserName\u003e\" with \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "users-ability-to-create-account;user-should-able-to-create-account-using-register;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 13,
      "id": "users-ability-to-create-account;user-should-able-to-create-account-using-register;;1"
    },
    {
      "cells": [
        "Sam",
        "123"
      ],
      "line": 14,
      "id": "users-ability-to-create-account;user-should-able-to-create-account-using-register;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4190635100,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User should able to create account using Register",
  "description": "",
  "id": "users-ability-to-create-account;user-should-able-to-create-account-using-register;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@newtour"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Browse to Newtours homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Navigate to Register page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Fill form with some basic information",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Complete creating account with \"Sam\" with \"123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "NewtoursRegisterSteps.browse_to_Newtours_homepage()"
});
formatter.result({
  "duration": 2969171400,
  "status": "passed"
});
formatter.match({
  "location": "NewtoursRegisterSteps.navigate_to_Register_page()"
});
formatter.result({
  "duration": 226620000,
  "status": "passed"
});
formatter.match({
  "location": "NewtoursRegisterSteps.fill_form_with_some_basic_information()"
});
formatter.result({
  "duration": 1689453000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sam",
      "offset": 32
    },
    {
      "val": "123",
      "offset": 43
    }
  ],
  "location": "NewtoursRegisterSteps.complete_creating_account_with_with(String,String)"
});
formatter.result({
  "duration": 632417200,
  "status": "passed"
});
formatter.match({
  "location": "NewtoursRegisterSteps.verify_account_created_successfully()"
});
formatter.result({
  "duration": 383621600,
  "status": "passed"
});
formatter.after({
  "duration": 56000,
  "status": "passed"
});
formatter.uri("NewtoursLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Users ability to login",
  "description": "",
  "id": "users-ability-to-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@newtour"
    },
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User should able to login using Sign-On Feature",
  "description": "",
  "id": "users-ability-to-login;user-should-able-to-login-using-sign-on-feature",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Land to Newtours homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Navigate to Sign-On page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Fill login form with valid username and password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify login successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "users-ability-to-login;user-should-able-to-login-using-sign-on-feature;",
  "rows": [
    {
      "cells": [
        "UserName"
      ],
      "line": 13,
      "id": "users-ability-to-login;user-should-able-to-login-using-sign-on-feature;;1"
    },
    {
      "cells": [
        "Sam"
      ],
      "line": 14,
      "id": "users-ability-to-login;user-should-able-to-login-using-sign-on-feature;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3370939900,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User should able to login using Sign-On Feature",
  "description": "",
  "id": "users-ability-to-login;user-should-able-to-login-using-sign-on-feature;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@newtour"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Land to Newtours homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Navigate to Sign-On page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Fill login form with valid username and password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "NewtoursLoginSteps.land_to_Newtours_homepage()"
});
formatter.result({
  "duration": 2901656200,
  "status": "passed"
});
formatter.match({
  "location": "NewtoursLoginSteps.navigate_to_Sign_On_page()"
});
formatter.result({
  "duration": 270045700,
  "status": "passed"
});
formatter.match({
  "location": "NewtoursLoginSteps.fill_login_form_with_valid_username_and_password()"
});
formatter.result({
  "duration": 213600800,
  "status": "passed"
});
formatter.match({
  "location": "NewtoursLoginSteps.click_login_button()"
});
formatter.result({
  "duration": 337917900,
  "status": "passed"
});
formatter.match({
  "location": "NewtoursLoginSteps.verify_login_successfully()"
});
formatter.result({
  "duration": 25671100,
  "status": "passed"
});
formatter.after({
  "duration": 34500,
  "status": "passed"
});
});