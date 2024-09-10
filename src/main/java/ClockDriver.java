package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        
        System.out.println("Testing ClockDisplay: ");

        
        //      * Empty constructor & read time
        
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("\tEmpty Constructor Test - " + test1Output + "\n");
        
        
        //      * Constructor w/ time given & read time
        
        ClockDisplay test2 = new ClockDisplay(2, 45);
        String test2Output = test2.getTime();
        System.out.println("\tArg Constructor Test - " + test2Output + "\n");
        
        
        //      * Set time
        //      * Read time
        
        test2.setTime(5, 15);
        String test3Output = test2.getTime();
        System.out.println("\tSet Time & Read Time Test - " + test3Output + "\n");

        
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        
        ClockDisplay tickTest1 = new ClockDisplay(3, 32);
        String tickTest1Output = tickTest1.getTime();
        System.out.println("\tTick Test 1 Pre-Increment - " + tickTest1Output);
        tickTest1.timeTick();
        tickTest1Output = tickTest1.getTime();
        System.out.println("\tTick Test 1 Post-Increment - " + tickTest1Output + "\n");
        
        
        //  * Tick test for 03:09 to 03:10
        
        ClockDisplay tickTest2 = new ClockDisplay(3, 9);
        String tickTest2Output = tickTest2.getTime();
        System.out.println("\tTick Test 2 Pre-Increment - " + tickTest2Output);
        tickTest2.timeTick();
        tickTest2Output = tickTest2.getTime();
        System.out.println("\tTick Test 2 Post-Increment - " + tickTest2Output + "\n");
        
        
        //  * Tick test for 01:59 to 02:00
        
        ClockDisplay tickTest3 = new ClockDisplay(1, 59);
        String tickTest3Output = tickTest3.getTime();
        System.out.println("\tTick Test 3 Pre-Increment - " + tickTest3Output);
        tickTest3.timeTick();
        tickTest3Output = tickTest3.getTime();
        System.out.println("\tTick Test 3 Post-Increment - " + tickTest3Output + "\n");
        
        
        //  * Tick test for 09:59 to 10:00
        
        ClockDisplay tickTest4 = new ClockDisplay(9, 59);
        String tickTest4Output = tickTest4.getTime();
        System.out.println("\tTick Test 4 Pre-Increment - " + tickTest4Output);
        tickTest4.timeTick();
        tickTest4Output = tickTest4.getTime();
        System.out.println("\tTick Test 4 Post-Increment - " + tickTest4Output + "\n");
        
        
        //  * Tick test for 23:59 to 00:00
        
        ClockDisplay tickTest5 = new ClockDisplay(23, 59);
        String tickTest5Output = tickTest5.getTime();
        System.out.println("\tTick Test 5 Pre-Increment - " + tickTest5Output);
        tickTest5.timeTick();
        tickTest5Output = tickTest5.getTime();
        System.out.println("\tTick Test 5 Post-Increment - " + tickTest5Output + "\n");
        
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        
        System.out.println("Testing ClockDisplaySeconds: ");
        
        
        //      * Empty constructor & read time
        
        ClockDisplaySeconds testSec1 = new ClockDisplaySeconds();
        String testSec1Output = testSec1.getTime();
        System.out.println("\tEmpty Constructor Test - " + testSec1Output + "\n");
        
        
        //      * Constructor w/ time given & read time
        
        ClockDisplaySeconds testSec2 = new ClockDisplaySeconds(2, 45, 30);
        String testSec2Output = testSec2.getTime();
        System.out.println("\tArg Constructor Test - " + testSec2Output + "\n");
        
        
        //      * Set time
        //      * Read time
        
        testSec2.setTime(5, 15, 45);
        String testSec3Output = testSec2.getTime();
        System.out.println("\tSet Time & Read Time Test - " + testSec3Output + "\n");
        
        
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        
        ClockDisplaySeconds tickSecTest1 = new ClockDisplaySeconds(3, 32, 59);
        String tickSecTest1Output = tickSecTest1.getTime();
        System.out.println("\tTick Test 1 Pre-Increment - " + tickSecTest1Output);
        tickSecTest1.timeTick();
        tickSecTest1Output = tickSecTest1.getTime();
        System.out.println("\tTick Test 1 Post-Increment - " + tickSecTest1Output + "\n");
        
        
        //  * Tick test for 01:00:59 to 01:01:00
        
        ClockDisplaySeconds tickSecTest2 = new ClockDisplaySeconds(1, 00, 59);
        String tickSecTest2Output = tickSecTest2.getTime();
        System.out.println("\tTick Test 2 Pre-Increment - " + tickSecTest2Output);
        tickSecTest2.timeTick();
        tickSecTest2Output = tickSecTest2.getTime();
        System.out.println("\tTick Test 2 Post-Increment - " + tickSecTest2Output + "\n");
        
        
        //  * Tick test for 01:59:59 to 02:00:00
        
        ClockDisplaySeconds tickSecTest3 = new ClockDisplaySeconds(1, 59, 59);
        String tickSecTest3Output = tickSecTest3.getTime();
        System.out.println("\tTick Test 3 Pre-Increment - " + tickSecTest3Output);
        tickSecTest3.timeTick();
        tickSecTest3Output = tickSecTest3.getTime();
        System.out.println("\tTick Test 3 Post-Increment - " + tickSecTest3Output + "\n");
        
        
        //  * Tick test for 23:59:59 to 00:00:00
        
        ClockDisplaySeconds tickSecTest4 = new ClockDisplaySeconds(23, 59, 59);
        String tickSecTest4Output = tickSecTest4.getTime();
        System.out.println("\tTick Test 4 Pre-Increment - " + tickSecTest4Output);
        tickSecTest4.timeTick();
        tickSecTest4Output = tickSecTest4.getTime();
        System.out.println("\tTick Test 4 Post-Increment - " + tickSecTest4Output + "\n");
        
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        
        System.out.println("Testing ClockDisplay12Hour");
        
        
        //      * Empty constructor & read time
        
        ClockDisplay12Hour testHr1 = new ClockDisplay12Hour();
        String testHr1Output = testHr1.getTime();
        System.out.println("\tEmpty Constructor Test - " + testHr1Output + "\n");
        
        
        //      * Constructor w/ time given & read time
        
        ClockDisplay12Hour testHr2 = new ClockDisplay12Hour(5, 45, true);
        String testHr2Output = testHr2.getTime();
        System.out.println("\tArg Constructor Test - " + testHr2Output + "\n");
        
        
        //      * Set time
        //      * Read time
        
        testHr2.setTime(1, 23, false);
        String testHr3Output = testHr2.getTime();
        System.out.println("\tSet Time & Read Time Test - " + testHr3Output + "\n");
        
        
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        
        ClockDisplay12Hour tickHrTest1 = new ClockDisplay12Hour(3,32,true);
        String tickHrTest1Output = tickHrTest1.getTime();
        System.out.println("\tTick Test 1 Pre-Increment - " + tickHrTest1Output);
        tickHrTest1.timeTick();
        tickHrTest1Output = tickHrTest1.getTime();
        System.out.println("\tTick Test 1 Post-Increment - " + tickHrTest1Output + "\n");
        
        
        //  * Tick test for 11:59PM to 12:00AM
        
        ClockDisplay12Hour tickHrTest2 = new ClockDisplay12Hour(11,59,true);
        String tickHrTest2Output = tickHrTest2.getTime();
        System.out.println("\tTick Test 2 Pre-Increment - " + tickHrTest2Output);
        tickHrTest2.timeTick();
        tickHrTest2Output = tickHrTest2.getTime();
        System.out.println("\tTick Test 2 Post-Increment - " + tickHrTest2Output + "\n");
        
        
        //  * Tick test for 11:59AM to 12:00PM
        
        ClockDisplay12Hour tickHrTest3 = new ClockDisplay12Hour(11,59,false);
        String tickHrTest3Output = tickHrTest3.getTime();
        System.out.println("\tTick Test 3 Pre-Increment - " + tickHrTest3Output);
        tickHrTest3.timeTick();
        tickHrTest3Output = tickHrTest3.getTime();
        System.out.println("\tTick Test 3 Post-Increment - " + tickHrTest3Output + "\n");
        
        
        //  * Tick test for 12:59PM to 01:00PM
        
        ClockDisplay12Hour tickHrTest4 = new ClockDisplay12Hour(12,59,true);
        String tickHrTest4Output = tickHrTest4.getTime();
        System.out.println("\tTick Test 4 Pre-Increment - " + tickHrTest4Output);
        tickHrTest4.timeTick();
        tickHrTest4Output = tickHrTest4.getTime();
        System.out.println("\tTick Test 4 Post-Increment - " + tickHrTest4Output + "\n");
        
        
    }
}
