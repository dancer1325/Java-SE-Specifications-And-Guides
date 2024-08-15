* Packages
  * allows
    * organizing the programs
  * 's members == classes + interfaces /
    * -- are declared in -- compilation units of the package & subpackages
      * code | compilation unit, automatically
        * -- has access to -- ALL classes & interfaces / declared | it's package
        * imports ALL the public classes & interfaces | predefined package "java.lang"
  * naming structure is hierarchical
  * name for classes & interfaces / package
    * -> prevent name conflicts
  * if program is simple or casual development -> package can be 
    * unnamed or
    * simple name
* Module
  * use cases
    * 👁️set of packages / is sufficiently cohesive 👁️
  * allows controlling how
    * it's packages -- , via dependencies, use -- other modules 
    * other modules -- ,via exporting, can use -- it's packages
  * 👁️ it's packages -- are categorized as -- exported 👁️
    * == packages' classes & interfaces -- can be accessed from -- outside the module
    * if a package is NOT exported -> package's classes & interfaces -- are ONLY accessible from -- inside the module
  * if module1's code -- want to access -- module2's exported package < = > module1 -- depends on -- module2
* ways to store Packages & Modules
  * | file system
    * 👁️ may have constraints about the organization of their compilation units 👁️
  * | DDBB
* accessibility
  * ONLY if top level class or interface is declared `public` -> accessible outside the package
  * ONLY if top level class or interface is declared `public` + member of an exported package -> accessible outside the module
  * if class or interface is declared `public`, BUT NOT member of an exported package -> accessible ONLY | module