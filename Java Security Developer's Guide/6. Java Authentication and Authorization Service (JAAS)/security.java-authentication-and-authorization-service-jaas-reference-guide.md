https://docs.oracle.com/en/java/javase/23/security/java-authentication-and-authorization-service-jaas-reference-guide.html#GUID-2A935F5E-0803-411D-B6BC-F8C64D01A25C

* common steps
  * authenticate
  * authorize
* use cases
  * for authentication of users
    * == reliably and securely -- determine -- WHO is currently executing Java code
      * / regardless of WHERE the code runs (application, an applet, a bean, or a servlet)
    * steps
      * instantiate a `LoginContext` object / -- references a -- configuration / determine the authentication technology or technologies, or `LoginModule`(s) to use
        * ways to verify by the `LoginModule`(s)
          * prompt for & verify a userName and password
          * read & verify a voice or fingerprint sample
  * for authorization of users
    * == users have the access control rights (permissions) -- required to do the -- actions performed
      * -> -- uses -- core Java SE access control model
    * -- depends on --
      * executing code's CodeSource 
      * user or service running the code == `Subject` object 
        * if authentication succeeds -> `Subject` -- is updated, with relevant Principals and credentials, by a -- `LoginModule`  
* 💡-- implements a -- standard Pluggable Authentication Module (PAM) framework (Java version of it) 💡/
  * augments the Java security architecture     
    * _Example:_ Java
      * provides access controls /
        * codesource-based 
        * ❌NOT who runs the code ❌
  * pluggable 
    * == applications -- independent of -- underlying authentication technologies  
    * == you can ADD or UPDATE authentication technologies / WITHOUT modifying the application
* Core classes & interfaces
  * Common classes
    * := those / -- used by -- JAAS authentication & authorization components
    * [`Subject`](https://docs.oracle.com/en/java/javase/23/docs/api/java.base/javax/security/auth/Subject.html)
      * uses
        * 💡source of a request 💡 
      * ⚠️application writer does NOT have to instantiate a `Subject` ⚠️
        * Reason: 🧠if the application instantiates a `LoginContext` & NOT pass a `Subject` -> `LoginContext` -- instantiate a -- NEW empty `Subject` 🧠
      * TODO: "Note:An AuthPermission with target "modifyPrincipals", "modifyPublicCredentials", or"
    * [Principal](https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/security/Principal.html)
    * Credentials
      * == ANY `Object`
  * Authentication classes and interfaces
    * 
  * Authorization classes
    * 
* TODO: