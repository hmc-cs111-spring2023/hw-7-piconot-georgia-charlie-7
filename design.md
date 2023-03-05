# Design

## Who is the target for this design, e.g., are you assuming any knowledge on the part of the language users?

The target for this design is a CS5 student, like with the original PicoBot syntax. The user should have a basic understanding of how PicoBot works, e.g., the goal of covering the entire room, etc. However, the user does not need to have any prior CS knowledge.

## Why did you choose this design, i.e., why did you think it would be a good idea for users to express the maze-searching computation using this syntax?

We choose this design because it makes it clear to the user how the PicoBot reads in the instructions. Each instruction provides a scenario that the PicoBot may be in, and then provides the rules for what the PicoBot must then do. Because of the simple syntax to create the condition and reaction of the PicoBot, it will be easy for the user to create instructions.

## What behaviors are easier to express in your design than in Picobot’s original design?  If there are no such behaviors, why not?

Our PicoBot language is very similar to the original Picobot design, just adapted to be an internal language in Scala. Therefore, the behaviors should be equally as easy to express as the original Picobot design, or a little bit easier because the syntax is more accessible to the user.

## What behaviors are more difficult to express in your design than in Picobot’s original design? If there are no such behaviors, why not?

Similar answer as for the question above, our language should be very similar to the original Picobot design, if not a little bit easier because the syntax is more accessible to the user.

## On a scale of 1–10 (where 10 is “very different”), how different is your syntax from PicoBot’s original design?

4: The new design uses a more prose-like syntax, to improve readability for beginning CS students, but the basic layout of “Surrounding, Current State; New Direction, New State” is basically unchanged. We felt that the existing design was already nearly-perfect from a comprehensibility standpoint, and we only really wished that it read more seamlessly.

## Is there anything you would improve about your design?

It would be nice to be able to write N*Wx instead of “N*Wx”, so that the user wouldn’t have to put quote marks around it. To do this in Scala, unfortunately, this would probably require us to create a complicated data type, or enumerate every possible combination of directions.
