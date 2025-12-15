# Banking Service – Technical Test

## Context
This project is a solution for the "Banking Service" technical test.

The goal is to implement the core functionalities of a banking account:
- Deposit money
- Withdraw money
- Print bank statements

The public interface provided in the test instructions has been strictly respected.

## Technical Choices
- Language: Java
- Data storage: In-memory (ArrayList)
- No external frameworks or repositories
- Simple and clean domain-driven design

## How to Run the Project

1. Open the project with IntelliJ IDEA
2. Run the `Main` class
3. The console will display the account statement

## Example Output

DATE | AMOUNT | BALANCE
2025-12-15 | 1000 | 1000
2025-12-15 | 2000 | 3000
2025-12-15 | -500 | 2500


## Error Handling
- Negative or zero amounts are rejected
- Withdrawals exceeding the balance throw an exception

## Notes
This solution focuses on simplicity, correctness, and clean code, as recommended in the test instructions.
