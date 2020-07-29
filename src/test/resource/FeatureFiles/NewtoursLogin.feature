@newtour @regression 
Feature: Users ability to login 

Scenario Outline: User should able to login using Sign-On Feature 

	Given Land to Newtours homepage 
	When Navigate to Sign-On page 
	And Fill login form with valid username and password 
	And Click login button 
	Then Verify login successfully 
	
	Examples: 
		|UserName |
		|Sam 	  |