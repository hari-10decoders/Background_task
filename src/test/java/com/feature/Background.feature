Feature: To check the login functionality by using background

  Background: User is Logged In
    Given : User is click the Login field
    Given : User Enter the email ID in Email ID Field
    Given : User Enter the password in Password Field
    Given : User Hit the log in button

  Scenario: To check the Work_space field
    Given : User click the work_space field
    Then : User Click the Edit field in Input field

  Scenario: To check the Exist fields and ensure get respective output
    Given :User Enter the FullName in Enter your full Name field
    When : User press the tab in keaboard
    And : User Get the text from What is inside the text box field
    Then : User clear the existing text from Clear the text field
