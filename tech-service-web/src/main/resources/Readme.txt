

----Important take aways from the fixing multi module branch-----------

!. The commandLineRunner issues you were getting were in relation to the package name between web and data being different
    the fact they were in different modules didnt matter
    and even if the packages were different names the java still worked but the springboot didnt because by default to find the
    right beans it must be in the direct package

    With Spring, we use the @ComponentScan annotation along with the @Configuration annotation to specify the packages that
    we want to be scanned. @ComponentScan without arguments tells Spring to scan the current package and all of its sub-packages.


2. misc theory
    The beans in Spring are stored in an IoC (Inversion of Control) container which is often referred as Application Context.

    How do we create a Bean ?
    There are many ways by which we can create a Bean. Using @Component annotation is one of those.

3. command line runner
    Spring Boot will automatically call the run method of all beans implementing
    commandLineRunner interface AFTER the application context has been loaded.
    