# Evaluation: running commentary

## Internal DSL

_Describe each change from your ideal syntax to the syntax you implemented, and
describe_ why _you made the change._

**On a scale of 1–10 (where 10 is "a lot"), how much did you have to change your syntax?**

6: we kept the same general structure, but we had to adapt it to work within Scala's 
syntax and we have it closer fit the library picolib.
1. We had to switch from just the raw NEWS format to having it in quotes because Scala
does not allow us to easily read in the values without creating custom functions for
each possible NEWS combination.
2. We added more keywords (added when) in order for us to be able to call the functions
without parentheses as we desired.
3. We changed the keyword Halt to instead by StayHere, which aligns with the types from
the picolib library.
4.  In order to have error handeling for the surroundings input be simpler, it takes in
the letter B instead of N, E, W or S, and bases the surroundings off of the input given
in the NEWS order.

I'm pretty happy with how it turned out though, as I think it's still pretty readable.

**On a scale of 1–10 (where 10 is "very difficult"), how difficult was it to map your syntax to the provided API?**

3: our syntax was a pretty natural match for the way the API was constructed. The 
main sticking point was getting our function to add rules to the rule list, as it 
required us to use a special type of mutable ListBuffer.

## External DSL

_Describe each change from your ideal syntax to the syntax you implemented, and
describe_ why _you made the change._

**On a scale of 1–10 (where 10 is "a lot"), how much did you have to change your syntax?**

**On a scale of 1–10 (where 10 is "very difficult"), how difficult was it to map your syntax to the provided API?**
