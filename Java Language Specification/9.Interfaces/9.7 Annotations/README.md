* Annotation
  * := marker / 
    * information -- is associated with a -- program element
    * NO effect | runtime
  * 👁️== specific instance of an annotation interface 👁️ /
    * -- provide -- values for the interface's elements 
  * types
    * `NormalAnnotation`
      * most general
      * `@TypeName([ElementValuePairList])`
        * syntax
        * `@TypeName` OR `@ TypeName` 
          * annotation interface name
          * ` ` is allowed
            * Reason: 🧠`@` is a token separator 🧠
          * if typeName is NOT an accessible annotation interface -> error | compile-time
        * `[ElementValuePairList]`
          * optional
          * `ElementValuePairList` == `ElementValuePair1, ElementValuePair2, ...`
            * `ElementValuePair` == `Identifier=ElementValue`
              * `Identifier`
                * if it's != one of the annotation interface's elements name (== methods) -> error | compile-time 
              * `ElementValue` can be
                * `ConditionalExpression` or
                * `ElementValueArrayInitializer` or
                * `Annotation`
              * method / name == `Identifier` -> method's type == `ElementValuePair` 's type
              * TODO:
    * `MarkerAnnotation`
      * TODO:
    * `SingleElementAnnotation`
      * TODO:


## syntactic locations | program / annotations may appear
* TODO:


## multiple annotations | same interface
* depends on
  * interface declaration
* TODO: