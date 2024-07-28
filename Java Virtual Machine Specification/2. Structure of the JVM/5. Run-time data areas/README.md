* uses
  * execution of a program
* run-time data areas' life cycle
  * some of them
    * created | JVM start-up
    * destroyed | JVM terminates
  * some of them / thread
    * created | thread creation
    * destroyed | thread terminates
* JVM can support >= 1 thread / time
* pc Register
  * pc == program counter
  * 1! pc register / JVM thread
  * each JVM thread is executing single method's code | concrete time
    * if method is NOT native -> pc register contains the address of the JVM instruction / is being executed
    * if method is native -> JVM's pc register is undefined
  * hold `returnAddress` or native pointer | specific platform
* JVM stacks
  * TODO: