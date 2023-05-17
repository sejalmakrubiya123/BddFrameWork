

  Feature:  register
    @register @all

      Scenario: AS user , I should able to register successfully
               so that , I can use all user features

          Given I am a registration page
          When I enter required registration details
          Then I should able to register successfully