
@alltests
Feature: 

Background: url link 
Given open the URL 

@test1
Scenario:
When  Get URL expected and validate
Then get title

@test2
Scenario:
When  Check logo display
When get Hight and width of logo and compaire

@test3
Scenario:
When Validate main product categories count should be three
Then Get the list

@test4
Scenario: 
When enter T-Shirt in textbox
Then  Validate the condition

@test5
Scenario: 
When click on twitter logo
Then validate url in new window
Then validate account name 


