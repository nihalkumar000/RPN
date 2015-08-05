Feature: Validator 
As a user
I want to be able to check the  expression
So that I can validate the calculator

Scenario Outline: Calculator functions 
Given the inputs <input1> 
Then system should display a message <result>


Examples:
| input1  | result |
| "1 2 3 + -" | "-4" |

| input1  | result |
| "6 2 * 3 /" | "4" |

| input1  | result |
| "2 3 ^ 4 5 + + " | "17" |

| input1  | result |
| "50 % 2 *" | "1" |

| input1  | result |
| "3 ! 4 5 * +" | "26" |

| input1  | result |
| "12 3 / !" | "24" |

| input1  | result |
| "5 1 2 + 4 * + 3 -" | "14" |







