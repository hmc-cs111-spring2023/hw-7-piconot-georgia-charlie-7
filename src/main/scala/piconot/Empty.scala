import piconot.internal._
import picolib.semantics._

object Empty extends PicoLang("resources/empty.txt") {
    // State 0: move left
    when state 0 at "**x*" go West become 0		// go all the way to the left
    when state 0 at "**B*" go StayHere become 1	// can't go left anymore, so try to go up

    // State 1: move up
    when state 1 at "x***" go North become 1	// go all the way to the top
    when state 1 at "B**x" go South become 2	// can't go up any more, so try to go down 

    // States 2 and 3: fill from top to bottom, left to right

    // State 2: fill this column to the bottom
    when state 2 at "***x" go South become 2	// go all the way to the bottom
    when state 2 at "*x*B" go East become 3		// can't go down anymore, so try to go right

    // State 3: fill this column to the top
    when state 3 at "x***" go North become 3	// go all the way to the top
    when state 3 at "Bx**" go East become 2		// can't go up anymore, so try to go right

    picoRun
}
