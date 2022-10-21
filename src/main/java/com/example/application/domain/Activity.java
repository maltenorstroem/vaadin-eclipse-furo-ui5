package com.example.application.domain;

public class Activity {

   public Activity(){

   }
   private String id;
   private String description;
   private String its_owner;

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getIts_owner() {
      return its_owner;
   }

   public void setIts_owner(String its_owner) {
      this.its_owner = its_owner;
   }
}
