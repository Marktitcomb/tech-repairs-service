

---implementing jpa services with domain objs

TODO put profiles on the JPA and map based services so you can switch

TODO view this change in the embedded H2 db

 This is where you'll use all of the domain annotation and describe in your entity
 classes how they are actually connected in the db rather than having to manually do it.


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