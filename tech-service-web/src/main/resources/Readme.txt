

---implementing services

So its a very basic service model that just going to follow the CRUD model then different interfaces are going to extend
the main CRUD interface for different use cases

There is also the concept of service mapping brought in.
    Now these are the concrete implementations for all the different service interfaces
    These will be used as the default profile, there is also the JPA profile but we will come to that later

    Nothing overly special happening here the data isn't persisting anywhere just being stored as a hashmap
    in memory, hence -> 'map' service

    So it's all just in memory not being connected to the repositories like in (JPA)

    This is just used as a simple stage for testing etc

    public class OwnerMappingService extends AbstractMapService<Owner, Long>{ ....

    so now the Owner service implementation is extending the abstract class and filling
    in the generics so the concrete function in AbstractMapService can be used
    by calling super!!!
