Feature: Task One 
  @log
  Scenario: Logging into the URL
    Given Entering the url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And Entering the username "Admin" and password "admin123"
    Then logging into the profile
   
  @newUser
  Scenario: Adding the user in Admin portal
    Given Entering into the admin tab and adding user
    When Entering and selecting the datas Name "Jadine" Username "ramkumar" and password "Qwerty@25" cpass "Qwerty@25"
    Then Saving the data
    
  @logWithNewUser
  Scenario: Logging with new User
    Given Entering the url again "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And Entering the username "ramkumar" and password "Qwerty@25" again
    Then logging into the profile again
    
  @personalDetail
  Scenario: Adding the details in My Info
    Given Entering into the my info tab and adding details
    When Entering and selecting the datas required Last Name "Jadine"
    Then Saving all the personal detail
    
  @uploadResume
  Scenario: Uploading the Resume
    Given Selecting the Resume
    Then Saving the Resume
    
