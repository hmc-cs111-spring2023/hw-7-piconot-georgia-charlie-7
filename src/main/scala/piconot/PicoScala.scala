package piconot.internal

import picolib._
import picolib.maze._
import picolib.semantics._
import java.io.File
import scala.collection.mutable.ListBuffer

class PicoLang(val mazeName: String) extends App {
    // Create the rules list, to have rules added to it.
    val rules = ListBuffer.empty[Rule]

    // Nice view of the rules for the user.
    def showRules : Unit = {
        rules.map(println(_))
    }

    // Object used to create a new rules.
    object when {
        // Initialize values.
        // Note, these values will not be passed into a rule unless the functions are called out of order. 
        var initState = State("0")
        var surroundings = Surroundings(Anything, Anything, Anything, Anything)
        var direction : MoveDirection = North
        
        // Get the current state.
        def state(state: Int) = {
            initState = State(state.toString())
            this
        }

        // If the input has four characters, convert the four characters into a Surroundings object.
        def at(surr: String) = {
            if (surr.length != 4) then throw new IllegalArgumentException("surroundings argument has too few or too many values")
            else {
                surroundings = Surroundings(getDirection(surr(0)), getDirection(surr(1)), getDirection(surr(2)), getDirection(surr(3)))
                this
            }
        }

        // Get the new direction.
        def go(dir: MoveDirection) = {
            direction = dir
            this
        }

        // Get the final state and combine the given information to create a new rule. 
        def become(state: Int) = {
            rules += Rule(initState, surroundings, direction, State(state.toString()))
        }

        // Convert a char to a direction.
        private def getDirection(c: Char) = c match
            case '*' => Anything
            case 'x' => Open
            case 'B' => Blocked
            case _ => throw new IllegalArgumentException("illegal surroundings argument")
    }

    // Run the picobot program.
    def picoRun = {
        // Note, the user input for the maze file must include the folder where the maze file is.
        val maze = Maze(mazeName)
        object EmptyText extends TextSimulation(maze, rules.toList)
        EmptyText
    }
}
