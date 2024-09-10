package src.main.java;


public class ClockDisplay12Hour
{
    //Extend ClockDisplay for a 12 hour clock. This means you need to track AM/PM
    //Update all methods and parameters to accomodate this change
    //Implement 2 private NumberDisplay objects. 
    //  One for hours and one for minutes
    //Implement a private String for the display

    private NumberDisplay hours;
    private NumberDisplay minutes;
    private boolean amPM; // False = AM , True = PM
    private String display;
    
    
    
    //Implement a constructor that takes no parameters
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes as a NumberDisplay object with 60 as the limit
    //The constructor should call the method updateDisplay before finishing
    
    public ClockDisplay12Hour() {
        hours = new NumberDisplay(12);
        minutes = new NumberDisplay(60);
        amPM = false;
        updateDisplay();
    }
    
    
    //Implement a constructor that takes 2 parameters, hour and minute
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes as a NumberDisplay object with 60 as the limit
    //The constructor should call the method setTime with the parameters passed in
    
    public ClockDisplay12Hour(int hour, int minute, boolean timeState) {
        hours = new NumberDisplay(12);
        minutes = new NumberDisplay(60);
        amPM = timeState;
        setTime(hour, minute, timeState);
    }
    
    
    //Implement a method timeTick that takes no parameters and returns nothing
    //The method should increase the minute value by one each run
    //The hours should increase when the minutes roll over
    //The updateDisplay method should be called before finishing
    
    public void timeTick() {
        minutes.increment();
        // Checking to see if value rolled over to 0
        if(minutes.getValue() == 0) {
            hours.increment();
            if(hours.getValue() == 0) {
                amPM = changeBool(amPM);
            }
        }
        updateDisplay();
    }
    
    
    //Implement a method setTime that takes in 2 parameters, hour and minute
    //The method should set the hours value and minutes value
    //The updateDisplay method should be called before finishing
    
    public void setTime(int hour, int minute, boolean timeState){
        hours.setValue(hour);
        minutes.setValue(minute);
        amPM = timeState;
        updateDisplay();
    }
    
    
    //Implement a method getTime that takes no parameter and returns a String
    //The return String should be formatted as HH:MM and report out the current time
    
    public String getTime() {
        return display;
    }
    
    
    public boolean changeBool(boolean input) {
        boolean newBool = !input;
        return newBool;
    }
    //Implement a method updateDisplay that takes no parameters and returns nothing
    //The method should update the displayString with the current time in a format
    //  HH:MM
    
    public void updateDisplay() {
        String newDisplay = "";
        if(hours.getDisplayValue().equals("00")) {
            newDisplay += "12";
        } else {
        newDisplay += hours.getDisplayValue();
        }
        newDisplay += ":";
        newDisplay += minutes.getDisplayValue();
        if(amPM == false) {
            newDisplay += "AM";
        }
        else {
            newDisplay += "PM";
        }
        
        display = newDisplay;
    }
}
