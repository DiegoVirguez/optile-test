package com.diego.pesonal.optile.optile_excersice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
   public static void main(final String[] args) {

      final HandleJobs executeJobs = new HandleJobs();

      final ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);

      final Runnable job1 = () -> {
         executeJobs.setJob(new SendEmailJob());
         executeJobs.executeSpecificJob();
      };

      final Runnable job2 = () -> {
         executeJobs.setJob(new DataLoadJob());
         executeJobs.executeSpecificJob();

      };
      ses.schedule(job1, 5, TimeUnit.SECONDS);
      ses.schedule(job2, 2, TimeUnit.SECONDS);

      ses.shutdown();

   }
}
