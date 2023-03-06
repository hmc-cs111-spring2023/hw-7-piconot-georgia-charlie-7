package piconot.internal

import picolib._
import picolib.maze._
import picolib.semantics._
import java.io.File

// enum Direction:
//     case North, East, West, South

// @main
// def main() = 
//     val maze = Maze("resources" + File.separator + "empty.txt")
    // def run = object EmptyText extends TextSimulation(maze, rules.toList)

    // var rules = Seq[Rule]
class when(surr: String)(state: Int) {
    def go(direction: MoveDirection)(newState: Int) =
        Rule(
            State(state.toString()),
            Surroundings(c2d(surr(0)), c2d(surr(1)), c2d(surr(2)), c2d(surr(3))),
            direction,
            State(newState.toString())
        )
}

def c2d(c: Char) = c match
    case '*' => Anything
    case 'x' => Open
    case _ => Blocked   // currently allows any character to block


// having trouble getting imported
// line 18 is giving trouble "expression does not take parameters"
// everything commented out does not work- use ListBuffer?
// create main function
// user input for name of maze
// maybe MAYBE error handling if we somehow have time