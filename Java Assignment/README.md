#### Exericse 2
Memory - Slide 11

#### Exercise 4
- ILOAD: Load int from local variable
- IINC: Increment local variable by constant
- GOTO: Execution proceeds at that offset from the address of the opcode of this goto instruction. The target address must be that of an opcode of an instruction within the method that contains this goto instruction.

The bytecode corresponds to the loop because it first attempts to store two values to two variables, which is i and sum in L0-L1. Then it goes into a loop, which is usually what GOTO is signifying. 
In L3, it checks the condition, if it is true, it jumps to L4 and performs the operation. Then it reaches L3 and checks the condition again. 
Afterwards, when the loop finishes, it returns the value of sum.
L7 is just defining the properties of the functions, such as MAXLOCALS and the MAXSTACK.
