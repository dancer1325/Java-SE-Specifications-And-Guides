# Goal
* [Official documentation](https://docs.oracle.com/javase/specs/jls/se22/html/jls-9.html#jls-9.1)

* types of interface declarations
  * `NormalInterfaceDeclaration`
    * `{InterfaceModifier} interface TypeIdentifier [TypeParameters] [InterfaceExtends] [InterfacePermits] InterfaceBody`
      * `TypeIdentifier`
        * -- specify the -- interfaceName
        * 👁️ if interface's `TypeIdentifier` == ANY enclosing class or interface's `TypeIdentifier` -> compile-time error 👁️ 
          * enclosing == within the scope of another
  * `AnnotationInterfaceDeclaration` 
    * `{InterfaceModifier} @ interface TypeIdentifier AnnotationInterfaceBody`
      * `TypeIdentifier`
        * check previously
    * Check section "../Annotation Interface"
* interface declaration's scope & shadowing
  * check '../../names/scope of a declaration'

# Interface Modifiers
* available ones
  * Check "/Annotations"
  * `public`
    * allowed for
      * top level interfaces 
        * Check '../../7.Packages and Modules/Top Level Class and Interface Declarations'
      * member interfaces
        * Check '../Member Class and Interface Declarations'
  * `protected`
    * allowed ONLY for
      * member interfaces
        * Check '../Member Class and Interface Declarations'
  * `private`
    * allowed ONLY for
      * member interfaces
        * Check '../Member Class and Interface Declarations'
  * `abstract`
  * `static`
    * allowed for
      * local interfaces 
        * Check '../../14.Blocks, Statements, and Patterns/Local Class and Interface Declarations'
      * member interfaces
        * Check '../Member Class and Interface Declarations'
  * `sealed`
  * `non-sealed`
  * `strictfp`
* ⚠️compile-time errors are got, if ⚠️
  * interface declaration / 
    * \> 1 `sealed` or `non-sealed`
    * \> 1 `public`, `protected` or `private`
    * same keyword is repeated
* if several modifiers | 1! interface declaration -> recommended to declare in the previous order indicated


* TODO: 9.1.1.1. abstract Interfaces