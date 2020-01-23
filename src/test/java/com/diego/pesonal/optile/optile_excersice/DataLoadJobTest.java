package com.diego.pesonal.optile.optile_excersice;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DataLoadJobTest {

   @Test
   public void shouldexcuteTaskDataLoadJob() {
      final DataLoadJob dataLoadJobTest = new DataLoadJob();
      dataLoadJobTest.excuteTask();
      assertNotNull(dataLoadJobTest);

   }
}