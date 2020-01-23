package com.diego.pesonal.optile.optile_excersice;

public abstract class Job {

   private String status;

   public abstract void excuteTask();

   public String getStatus() {
      return status;
   }

   public void setStatus(final String status) {
      this.status = status;
   }

}
