# Data Structure Practice – Stack (Expression Evaluation)

Java exercise focused on practicing **stack data structures**, expression evaluation, and conversion between **infix**, **prefix**, and **postfix notations** using simple mathematical and logical expressions.

## Description
This project demonstrates how to use **stacks** to:

- Evaluate **prefix expressions**
- Evaluate **postfix expressions**
- Convert **infix expressions to postfix**
- Display **prefix and postfix forms** of logical expressions

The system shows how stacks store numbers or operators temporarily while evaluating or converting expressions, following the **LIFO (Last In, First Out)** principle.

The main program includes examples such as:

- Mathematical expressions: ``+ - * 2 3 5 / ^ 2 3 4``
- Logical expressions: ``(¬(p∧q)) ↔ (¬p ∨ ¬q)``
- Complex infix expressions converted to postfix

**Goal:** Practice **stack concepts** in Java and understand their role in **expression evaluation** and **conversion between notations**.

## Installation

To get started, clone the repository and navigate to the project directory:

```bash
git clone https://github.com/gustavorods/2026_1_1_exercises_using_stack_java.git <project_name>
cd <project_name>
```

Then compile and run the Java files.

Example:

```bash
javac *.java
java Expressoes
```

## Usage
The program demonstrates the following operations:

1. Evaluate prefix expressions
2. Evaluate postfix expressions
3. Convert infix expressions to postfix
4. Display prefix and postfix forms of logical expressions

## Example (Announcements + Output)
### Announced tasks:
```bash
1) Evaluate the prefix expression: + - * 2 3 5 / ^ 2 3 4
2) Convert infix expression to postfix: ((x+y)^2) + ((x-4)/3)
3) Evaluate postfix expression: 7 2 3 * - 4 9 ^ 3 / +
4) Provide prefix and postfix notation for: (¬(p∧q)) ↔ (¬p ∨ ¬q)
5) Convert infix expressions to postfix:
   a) (5*8-4)+3
   b) ((a+b)*c)+(((d/e)-f)*g)
```

### Expected output:
```bash
1) Resultado prefixa: 1
2) Pós-fixa: xy+2^x4-3/+
3) Resultado pós-fixa: 262151
4) Pré-fixa: ↔ ¬ ∧ p q ∨ ¬ p ¬ q
   Pós-fixa: p q ∧ ¬ p ¬ q ∨ ↔
5a) 58*4-3+
5b) ab+c*de/f-g*+
```

## License

This project is licensed under the MIT License.

## Credits

This activity was developed based on exercises from Professor *ELIANE OLIVEIRA SANTIAGO* at **FATEC Zona Leste**.
