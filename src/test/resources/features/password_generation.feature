Feature: Password Generation

	Background:
		Given the user if on the password generation page

	Scenario: User generates a valid password
		When the user enters a valid password and clicks the generate button
		Then the system should display a message indicating the password is valid

	Scenario: User generates an invalid password
		When the user enters an invalid password and clicks the generate button
		Then the system should display a message indicating the password is invalid