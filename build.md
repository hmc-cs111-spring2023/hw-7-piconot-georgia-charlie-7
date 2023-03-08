# Building and running Piconot

First, create a file that imports both ```piconot.internal._``` and ```picolib.semantics._```. Then, create an object representing the set of rules, extending our piconot language and importing the Maze file, e.g. ```object Empty extends PicoLang("resources/empty.txt") {}```. Next, write your rules, one per line, with our syntax inside the curly braces of that object. The last rule should either be ```picoRun``` to run the program or ```showRule``` to show all the rules in a compact format. Finally, use ```sbt run``` to run the program.

Rules should be of the syntax
```when state 0 at "B*x*" go West become 0```, where
- the integer after ```state``` represents the initial state,
- the string after ```at``` represents the NEWS surroundings of the bot,
- the direction after ```go``` represents either North, East, West, South, or StayHere, and
- the integer after ```become``` represents the new state.
