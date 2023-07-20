this project is a multi-Module Maven project that has:
--------------------------------------------------------
+ Reactor POM 
+-- 1. <config> .....   Configuration module 
+-- 2. <jaxrsapi> ...   JAX-RS API server  (depends on 1.)
+-- 3. <jsfclient> ..   JSF web app client  (depends on 1.)

Desctiption:
1. config : com.chace.mmsj
    Defines build profiles, defines application.properties that are going to be read by all other modules

2. jaxrsapi: 
    uses configModule as dependency

    RESTEasy JAX-RS 
    
2. jsfclient: 
    uses configModule as dependency
