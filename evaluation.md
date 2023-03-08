# Evaluation: running commentary

## Internal DSL

_Describe each change from your ideal syntax to the syntax you implemented, and
describe_ why _you made the change._

**On a scale of 1–10 (where 10 is "a lot"), how much did you have to change your syntax?**

6: we kept the same general structure, but we had to adapt it to work within Scala's 
syntax; for example, we had to switch from just the raw NEWS format to having it in 
quotes, and need more keywords so that we can call functions without parentheses. 
I'm pretty happy with how it turned out though, as I think it's still pretty 
readable.

**On a scale of 1–10 (where 10 is "very difficult"), how difficult was it to map your syntax to the provided API?**

3: our syntax was a pretty natural match for the way the API was constructed. The 
main sticking point was getting our function to add rules to the rule list, as it 
required us to use a special type of mutable ListBuffer.

## External DSL

_Describe each change from your ideal syntax to the syntax you implemented, and
describe_ why _you made the change._

**On a scale of 1–10 (where 10 is "a lot"), how much did you have to change your syntax?**

**On a scale of 1–10 (where 10 is "very difficult"), how difficult was it to map your syntax to the provided API?**
