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
  * 1! private JVM stack / JVM thread
    * once it's created the thread -> it's created the stack
  * store frames
  * == stack of a conventional language 
    * _Example:_ for C
    * hold
      * local variables
      * partial results
    * participates in 
      * method invocation
      * return
  * memory of a JVM stack does NOT need to be contiguous
  * 's size
    * fixed
      * chosen independently / stack | creation of the stack
    * dynamic
  * conditions / throw Errors | JVM stacks
    * if the computation | thread required > permitted -> JVM throws a `StackOverflowError`
    * if JVM stack is dynamic, but expansion WITHOUT enough memory or NOT enough memory to create the initial JVM stack | new thread -> JVM throws an `OutOfMemoryError`
* JVM Heap
  * 👁️ shared among ALL JVM threads 👁️
  * := run-time data area / allocates memory for ALL
    * class instances &
    * arrays
  * 's lifecycle
    * created | VM start-up
    * for objects -- is reclaimed by the -- garbage collector (automatic storage management system)
      * objects are NEVER explicitly deallocated 
      * garbage collector's technique -- can be chosen by the -- implementor's system requirements
  * 's size
    * fixed
    * dynamic
      * expanded or contracted -- depending on -- computation
  * does NOT need to be contiguous
  * conditions / throw Errors | JVM heaps
    * if required computation > garbage collector can provide -> JVM throws an `OutOfMemoryError`
* Method area 
  * TODO: