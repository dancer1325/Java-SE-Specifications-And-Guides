* run-time data areas
  * uses
    * execution of a program
  * ' life cycle
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
  * each JVM thread is executing 1! method's code | concrete time
    * if method is NOT native -> pc register contains the address of the JVM instruction / is being executed
    * if method is native -> JVM's pc register is undefined
  * hold | specific platform
    * `returnAddress` or
    * native pointer 
* JVM stacks
  * 👀1! private JVM stack / JVM thread 👀
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
  * 's memory does NOT need to be contiguous
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
  * conditions / throw Errors
    * if required computation > garbage collector can provide -> JVM throws an `OutOfMemoryError`
* Method area 
  * 👁️shared among ALL JVM threads 👁️
  * == 
    * storage area -- for -- compiled code of a conventional language
      * 👀-> part of the JVM heap 👀
      * this specification does NOT restrict
        * location of the method area or
        * policies -- used to manage -- compiled code
    * "text" segment | OS process
  * stores 
    * structures / class
      * _Example:_ run-time constant pool, field and method data, methods' and constructors' code
    * special methods / used | class, interface and instance initialization
  * 's lifecycle
    * created | JVM start-up
  * allowed | simple JVM implementations
    * choose not
      * garbage collect or
      * compact it
  * 's size
    * types
      * fixed
      * expanded -- as required by the -- computation
      * contracted
        * _Example:_ larger method area becomes unnecessary
    * allowed | JVM implementation
      * provide the programmer or the user control over
        * initial size
        * if varying-size -> [minimum, maximum]
  * does NOT need to be contiguous
  * conditions / throw Errors
    * if memory | method area can NOT be made available -- to satisfy an -- allocation request -> JVM throws an `OutOfMemoryError`
* run-time constant pool
  * TODO:is a per-class or per-interface run-time representation of the constant_pool table in a class file (§4.4). It contains several kinds of constants, ranging from numeric literals known at compile-time to method and field references that must be resolved at run-time. The run-time constant pool serves a function similar to that of a symbol table for a conventional programming language, although it contains a wider range of data than a typical symbol table.
  
    Each run-time constant pool is allocated from the Java Virtual Machine's method area (§2.5.4). The run-time constant pool for a class or interface is constructed when the class or interface is created (§5.3) by the Java Virtual Machine.
  
    The following exceptional condition is associated with the construction of the run-time constant pool for a class or interface:
  
    When creating a class or interface, if the construction of the run-time constant pool requires more memory than can be made available in the method area of the Java Virtual Machine, the Java Virtual Machine throws an OutOfMemoryError.
  
    See §5 (Loading, Linking, and Initializing) for information about the construction of the run-time constant pool.
* TODO: