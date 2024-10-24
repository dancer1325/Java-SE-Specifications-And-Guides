* acquires a 
  * 👀mutual-exclusion lock / on behalf of the executing thread 👀
    * once the statement is end up -> release the lock
    * 👀on behalf == owns 👀
      * -> NO other thread may acquire the lock
    * == locks / acquired by `synchronized` methods
    * 1! thread -- may acquire -- a lock / >=1 time
    * ⚠️acquire a lock / -- associated with an -- object -> NOT prevent ⚠️
      * other threads
        * -- can access -- object's fields
        * -- can use -- 
          * synchronized methods or
          * synchronized statement
      * invoke un-sync methods | object
* `synchronized ( Expression ) Block`
  * `Expression`
    * requirements
      * reference type
  * how is it executed?
    * evaluate `Expression`
      * if evaluation of `Expression` completes abruptly -> synchronized statement completes abruptly
      * if `Expression`'s value = `null` -> throw `NullPointerException`
      * let `Expression`'s value = `V` / != `null` -> 
        * executing thread locks the monitor / -- associated with -- `V` 
        * `Block` is executed
          * if `Block` completes normally -> 
            * monitor is unlocked
            * synchronized statement completes normally
          * if `Block` completes abruptly ->
            * monitor is unlocked
            * synchronized statement completes abruptly

## Example
* `javac Main. java`
* `java Main`