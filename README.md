# calculatorPL

The Calculator is a command-line program that evaluates arithmetic expressions and maintains a calculation history.

Design Choices

User Interaction: Runs in a loop, allowing continuous input.

Expression Evaluation: Uses ScriptEngineManager to process expressions.

History Feature: Stores past calculations in a list, accessible via the history command.

Algorithms & Data Structures

Data Structures: Uses ArrayList<String> for history and Scanner for input.

Algorithm: Expressions are processed and evaluated using Java’s ScriptEngineManager.

Improvements

Error Handling: Catches invalid expressions and provides feedback.

Whitespace Handling: Removes spaces for flexible input.

History Retrieval: Users can view past calculations.

File Handling

No file storage; all operations occur in-memory.
