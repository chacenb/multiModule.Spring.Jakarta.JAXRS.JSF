this project is a multi-Module Maven project that has:
--------------------------------------------------------
+ Reactor POM 
+-- 0. <config> .....   Configuration module 
+-- 1. <common> .....   Common assets module 
+-- 2. <jaxrsapi> ...   JAX-RS API server  (depends on 1.)
+-- 3. <jsfclient> ..   JSF web app client  (depends on 1.)

Desctiption:

0. <config> : com.chace:mmsj3.config
    - Defines build profiles for the whole application &&
    - defines application.properties file that is going to be read by all other modules

1. <common> : com.chace:mmsj3.common
    Defines common classes & interfaces to be used by all modules

2. <jaxrsapi> : com.chace:mmsj3.jaxrsapi 
    - uses <config> as dependency
    - JAX-RS resources
    - spring CDI
    
2. <jsfclient>: com.chace:mmsj3.jsfclient 
    - uses <config> as dependency
    - JAX-RS resources
    - spring CDI
