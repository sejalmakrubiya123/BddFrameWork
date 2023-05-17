


     Feature: refer a product to friend
       @refer_A_Friend @all
     Scenario: Registered user should be able to refer a product to friend successfully.
         Given  I am a registered user
         And I Log in into my account
         And I am on homepage
         When I click on build your own computer
         And I am on product page
          When  I click on Email a friend button
         Then Email a friend page should appear
         And I enter required Email a friend details
         And I click on send email button
         Then "Your message has been sent" should be seen successfully.