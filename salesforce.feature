Feature: Validating salesforce application
@smoke @sanity
Scenario Outline: Validating newDashboard
Given Click View All and click Dashboards from App Launcher
When Click on the New Dashboard option 
And Enter Name as <salesforceAutomation> and Click on Create.
And Click on Save and Verify Dashboard name.

Examples:
|salesforceAutomation|
|'salesforce Automation by sai'|

@sanity
Scenario Outline: Validating CreateAccount
When Click view All and click Sales from App Launcher for createAccount
And Click on Accounts tab 
And Click on New button for accountcreation
And Enter <name> as account name 
And Select Ownership as Public
And Click save and verify Account name

Examples:
|name|
|'saisuba'|

@regression
Scenario: validating CreateOpportunityWithoutMandatoryFields
When Click view All and click Sales from App Launcher for oppurtunity
And  Click on Opportunity tab for validation
And  Click on New button for validation
And Choose Close date as Tomorrow Date for validation
And Click on save for validation
And Verify the Alert message (Completethis field) displayed for Name and Stage

@functional @sanity
Scenario Outline: Validating createnewoppurtunity 
When Click view All and click Sales from App Launcher
And Click on Opportunity tab 
And Click on New button 
And Enter Opportunity name as <SalesforceAutomation>  Get the text and Store it
And Choose close date as Today 
And Select Stage as Need Analysis
And click Save and VerifyOppurtunity Name
Examples:
|SalesforceAutomation|
|'Salesforce Automation By sai'|



