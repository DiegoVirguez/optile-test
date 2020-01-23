package com.diego.pesonal.optile.optile_excersice;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HandleJobs {

   final private Random random = new Random();
   final private Set<Job> jobsSet = new HashSet<Job>();

   private Job job;

   public void executeSpecificJob() {

      job.excuteTask();
      job.setStatus(AplicationConstans.RUNNING);
      System.out.println("The current job is running");
      final int randomWithNextInt = random.nextInt(10);
      System.out.println("Random number:" + randomWithNextInt);
      if (randomWithNextInt > 5) {
         job.setStatus(AplicationConstans.SUCCESS);
         System.out.println("Job executed successfully");
         jobsSet.remove(job);
      } else {
         job.setStatus(AplicationConstans.FAILED);
         System.out.println("Job executed failed");
         jobsSet.add(job);
      }
   }

   public void setJob(final Job job) {
      this.job = job;

   }

}
