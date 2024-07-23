* types of class declarations
  * `NormalClassDeclaration`
    * `{ClassModifier} class TypeIdentifier [TypeParameters] [ClassExtends] [ClassImplements] [ClassPermits] ClassBody`
      * `TypeIdentifier`
        * -- specify the -- className
        * 👁️ if class's TypeIdentifier == ANY enclosing class or class's TypeIdentifier -> compile-time error 👁️
          * enclosing == within the scope of another
  * `EnumDeclaration`
    * Check "../ 8.9 Enum Classes"
  * `RecordDeclaration`
    * Check "../ 8.9 Record Classes"
  * implicit class declarations by
    * class instance creation expression
      * Check "../../15.Expressions/15.9Class Instance Creation Expressions"
    * enum constants / end up with a class body 
      * Check "../8.9Enum Classes"
* class declaration's scope & shadowing
  * check '../../6.names/6.3scope of a declaration'

## 8.1.1 Class Modifiers
* available ones
  * Check "../../9.Interfaces/9.7Annotations"
  * `public`
    * allowed for
      * top level classes 
        * Check '../../7.Packages and Modules/7.6Top Level Class and Interface Declarations'
      * member classes
        * Check '../../9.Interfaces/9.5Member Class and Interface Declarations'
  * `protected`
    * allowed ONLY for
      * member classes
        * Check '../9.Interfaces/9.5Member Class and Interface Declarations'
  * `private`
    * allowed ONLY for
      * member classes
        * Check '../9.Interfaces/9.5Member Class and Interface Declarations'
  * `abstract`
    * == 👁️ incomplete class 👁️
    * if you try to create an instance -- via "../../15.Expressions/15.9Class Instance Creation Expressions" -> you get a compile-time error
    * if you create a subclass of an abstract one / NOT abstract & you instantiate it -> abstract class's constructor is executed ->  abstract class's field initializers are executed
    * abstract methods can be declared | JUST abstract class, else -> compile-time error
    * a class "C" can have abstract methods if either of following is true
      * any member methods of "C" (declared or inherited), is abstract
      * any "C"'s superclasses has an abstract method / `package` access & NO method / overrides the abstract method from "C" or superclass of "C"
    * if an abstract class / NOT possible to create subclasses / -- implements -- ALL its abstract methods -> compile-time error
    * uses
      * subclasses complete the implementation
    * NOT use it
      * 👁️to prevent instantiation 👁️
  * `static`
    * allowed for
      * local classes 
        * Check '../../14.Blocks, Statements, and Patterns/Local Class and Interface Declarations'
      * member classes
        * Check '../Member Class and Interface Declarations'
  * `final`
  * `sealed`
  * `non-sealed`
  * `strictfp`
* ⚠️compile-time errors are got, if ⚠️
  * class declaration / 
    * \> 1 `sealed` or `non-sealed` or final
    * \> 1 `public`, `protected` or `private`
    * same keyword is repeated
* if several modifiers | 1! class declaration -> recommended to declare in the previous order indicated

* TODO:

## 8.1.4 Superclasses and Subclasses
* `extends ClassType`
  * `ClassType`
    * == 👁️ direct superclass type 👁️, of the class being declared
    * 👁️you get a compile-time error if 👁️
      * named class is NOT an accessible class
      * named class / is `sealed` & the class being declared != permitted subclass of the named class
      * named class / is `final`
        * Reason: 🧠 final classes are NOT allowed to have subclass 🧠  
      * named class / is `Enum` or `Record` & extended by other class / NOT `Enum` or `Record` respectively 
      * named class / type arguments / NON well-formed parameterizedtype OR wdilcard type argument
* if you try to extend "java.lang.Object" --  `class Object extends classTypeOfTheSuperClass` -- -> you get a compile-time error
  * Reason: 🧠 "java.lang.Object" is the MOST primordial class AND can NOT have direct superclass  🧠
* TODO: FROM "The direct superclass type of a class whose declaration lacks an extends clause is as follows:"
### Examples
* "Object.java"
  * `javac Object.java`
* "Animal.java Dog.java Cat.java"
  * `javac Animal.java Dog.java Cat.java`
* "FinalClass.java TryToExtendFinalClass.java"
  * `javac FinalClass.java TryToExtendFinalClass.java`
* "EnumClass.java TryToExtendEnumClass.java ExtendEnumClass.java"
  * `javac EnumClass.java TryToExtendEnumClass.java`
  * `javac EnumClass.java ExtendEnumClass.java`
    * Problems: How to extend an enum class?
      * Solution: TODO:
* TODO: Add examples for comprehend `Record` extension
* TODO: Add examples for comprehend type arguments extension

* TODO:

## How to run locally?
* `javac ClassFileName.java`
  * `javac ClassModifiersAbstract.java`
* `java ClassFileName`
  * `java ClassModifiersAbstract`
