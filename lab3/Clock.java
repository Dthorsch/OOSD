// Title: Lab3aq1
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 06/10/2026
/* Brief: The definition for a class Time is contained in Time.java on Blackboard. There is also
a driver program called TimeTest.java. Copy both these files to your folder. Compile
them and run the driver program. Can you follow what is happening? If not, ask for
help.
Provide another driver program Clock.java that will create a Time object - you should
pass to the Time constructor method the current time in hours and minutes. Hint:
use java.util.Calendar to create the time object as follows:
Calendar cal = Calendar.getInstance();
Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
Next, write a loop that calls method tick() every second and then prints the
stored time. The loop (and program) should terminate when the stored time
advances to the next minute.
Hint: to find out when a second has passed you will need to use
System.currentTimeMillis() which returns the number of milliseconds
elapsed since January 1, 1970. There are 1000 milliseconds in 1 second. */

import java.util.Calendar;

import lab3.Time;

public class Clock {
    

public static void main(String[]args)
{
    Calendar cal = Calendar.getInstance();
    Time myTimer = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));   
    final int ONEMINUTE = 60;

    try{
            for(int i = 0; i < ONEMINUTE; i++) //A for loop where the index is the current time in seconds
            {
                myTimer.tick();
                System.out.println(myTimer.toString());
                Thread.sleep(1000); //used to pause the program for 1 second
            }
        }

    catch (Exception e) {
            // catching the exception
            System.out.println(e);
        }
    

}
}

