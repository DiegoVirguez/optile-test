package com.diego.pesonal.optile.optile_excersice;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class SendEmailJobTest {

   @Test
   public void shouldexcuteTaskDataLoadJob() {
      final SendEmailJob sendEmailJob = new SendEmailJob();
      sendEmailJob.excuteTask();
      assertNotNull(sendEmailJob);

   }

}
