import piconot.internal._
import picolib.semantics._

// A picobot program that can solve a maze, using the right-hand rule written
// in our picobot language. 

object RightHand extends PicoLang("resources/maze.txt") {
    // State 0: moving north
    when state 0 at "*x**" go East become 1
    when state 0 at "xB**" go North become 0
    when state 0 at "BB**" go StayHere become 3

    // State 1: moving east
    when state 1 at "***x" go South become 3
    when state 1 at "*x*B" go East become 1
    when state 1 at "*BxB" go StayHere become 2

    // State 2: moving west
    when state 2 at "x***" go North become 0
    when state 2 at "B*x*" go West become 2
    when state 2 at "BxB*" go StayHere become 1

    // State 3: moving south
    when state 3 at "**x*" go West become 2
    when state 3 at "**Bx" go South become 3
    when state 3 at "x*BB" go StayHere become 0

    picoRun
}
