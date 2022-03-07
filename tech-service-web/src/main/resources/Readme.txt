

---implementing jpa services with domain objs

 This is where you'll use all of the domain annotation and describe in your entity
 classes how they are actually connected in the db rather than having to manually do it.

 So rather than just storing the entities in a map they actually relate to each other now and
 are stored in the h2 using the repositories


 ------------------One repair item to many repairs--------------------

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "repairItem")
     private Set<Repair> repair;

   @ManyToOne
   @JoinColumn(name = "repairItem_id")
   private RepairItem repairItem;
   ------------------------------------------------------------------
                       =================
   ------------------------Bootstrap---------------------------------

    Be very careful the order you combine and save the objects
   ------------------------------------------------------------------
                        =================
    ---------------Access the h2 db----------------------------------

    Chuck these in application properties....
    /**
     spring.datasource.url=jdbc:h2:mem:testdb
        spring.datasource.driverClassName=org.h2.Driver
        spring.datasource.username=sa
        spring.datasource.password=

        spring.jpa.show-sql=true
        spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.H2Dialect
        spring.jpa.hibernate.ddl-auto= update
        spring.h2.console.enabled=true
        spring.h2.console.path=/h2-ui
        http://localhost:8080/h2-console/
    */
    !!!!!!!!!!!!!!       JDBC url   =    jdbc:h2:mem:testdb    !!!!!!!!!!!!!!!!!!!
    -----------------------------------------------------------------
                    =================

   ---------------@Mock and @InjectMocks-------------------------------
        @Mock creates a mock. @InjectMocks creates an instance of the class
        and injects the mocks that are created with the @Mock (or @Spy)
        annotations into this instance.

        Note you must use @RunWith(MockitoJUnitRunner.class)
        or Mockito.initMocks(this) to initialize these mocks and inject them (JUnit 4).

        With JUnit 5, you must use @ExtendWith(MockitoExtension.class).
   --------------------------------------------------------------------

                            =================
   --------------------------------------------------------------------
 we also mapped an enum with jpa using the below in RepairItem - double check in H2 this has ,ade a separate table
    @Enumerated(EnumType.ORDINAL)
    private Type type;
 This causes JPA to perform the following

             insert
             into
                 RepairItem
                 (itemDescription, type, id)
             values
                 (?, ?, ?)
             binding parameter [1] as [INTEGER] - [0]
             binding parameter [2] as [VARCHAR] - [ordinal title]
             binding parameter [3] as [INTEGER] - [1]

  Just the standard one to one below
  The connected table name repairItem_id i think is created by JPA
  as the id in base entity doesn't explicitly say what column
      @OneToOne
      @JoinColumn(name = "repairItem_id")
      private RepairItem repairItem;