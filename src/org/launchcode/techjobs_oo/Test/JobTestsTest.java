package org.launchcode.techjobs_oo.Test;

import org.junit.Before;
import org.launchcode.techjobs_oo.Job;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTestsTest {
    private Job job1;
    private Job job2;
    @Before
    public void jobObjects(){
        Job job1 = new Job();
        Job job2 = new Job();
    }

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();

        assertEquals(job1.getId() +1, job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       /* assertEquals("Product tester", job.getName());*/
        assertTrue(job.getEmployer() instanceof Employer);
        assertEquals("ACME", job.getEmployer().toString());
        assertTrue(job.getLocation() instanceof  Location);
        assertEquals("Desert", job.getLocation().toString());
        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals("Quality control", job.getPositionType().toString());
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job falseJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job.equals(falseJob));

    }

/*    @Test
    public void returnsABlankLine(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        char begining = job.toString().charAt(0);
        char end = job.toString().charAt(job.toString().length() - 1);
*//*
        char end = job.toString().charAt(job.toString().charAt(-1));
*//*
*//*
        int end = job.toString().length() -1;
*//*

        assertEquals('\n', end);
*//*        assertEquals("\n", job.toString().charAt(end));*//*

*//*        assertEquals('\n', job.toString().charAt(0));
        assertEquals('\n', job.toString().charAt(-1));*//*


    }*/

    @Test
    public void labelField(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals( job.toString(),"\nId: " + job.getId() + "\nName: " + job.getName()+
                "\nEmployer: " + job.getEmployer().getValue() +
                "\nLocation: " + job.getLocation().getValue() +
                "\nPosition Type: " + job.getPositionType().getValue() + "\nCore Competency: " +
                job.getCoreCompetency().getValue());
    }


    @Test
    public void emptyField(){
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
/*
        assertEquals("Data not available", job.toString());

*/
        assertEquals( "\nId: " + job.getId() + "\nName: Data not Available" + "\nEmployer: Data not Available"+ "\nLocation: Data not Available" +
                "\nPosition Type: Data not Available" + "\nCore Competency: Data not Available", job.toString());

    }

/*    @Test
    public void bonusJobTest(){
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertEquals("OOPS! This job does not seem to exist.", job.toString());
    }*/


}