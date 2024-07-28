* Frame
  * uses
    * store
      * data
      * partial results
    * perform dynamic linking
    * return values for methods
    * dispatch exceptions
  * 👁️ 's lifecycle 👁️
    * once a method is invoked -> new frame is created
    * if method invocation completes (normal or abrupt) -> frame is destroyed
  * allocated -- from -- JVM stack of the thread
  * == own []localVariables + own operandStack + current method's class reference to run-time constant pool
    * own []localVariables's size & own operandStack's size
      * are 
        * determined | compile-time
        * allocated | method invocation
      * -- supplied along with -- method / associated with the frame
      * -> frame data structure's size -- depends ONLY on the -- implementation of the JVM
    * own []localVariables & own operandStack -- has got typically reference to the -- "current frame"
  * "current frame"
    * := frame for the executing method ("current method") / defined on a class ("current class")
    * 's lifecycle
      *  active at ANY point | thread of control
      * 👁️ if "current method" invokes to another method OR completes
        * -> frame ceases to be current 👁️
        * & control -- transfers to the -- new method -> new frame is created
  * / created by a thread -> local to that thread
    * == can NOT be referenced by -- another thread
  * can be heaped allocated
    * Reason: 🧠JVM stack is never manipulated (except to push & pop frames) 🧠
* Local variables
  * TODO: