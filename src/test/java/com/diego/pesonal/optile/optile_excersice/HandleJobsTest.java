package com.diego.pesonal.optile.optile_excersice;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Queue;
import java.util.Random;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class HandleJobsTest {

   @Mock
   Random random;
   @Mock
   Queue<Job> jobsQueue;
   @Mock
   Set<Job> jobsSet;
   @Mock
   Job job;

   @InjectMocks
   private HandleJobs handleJobs;

   @Before
   public void setUp() {
      MockitoAnnotations.initMocks(this);
   }

   @Test
   public void shouldexecuteSpecificJob() {
      handleJobs.executeSpecificJob();
      verify(job, times(1)).excuteTask();

   }

}
