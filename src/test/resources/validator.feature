Feature: Validator 
As a user
I want to be able to check the  expression
So that I can validate the calculator

Scenario Outline: Calculator functions 
Given the inputs <input1> 
Then system should display a message <result>


Examples:
| input1  | result |
| "5 7 +" | "12" |