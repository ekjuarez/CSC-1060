
// Evan Knudsen

public class Time {
    // Private data fields
    int hours;
    int minutes;
    int seconds;

    // Default constructor setting time to midnight
    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Constructor to pass in attributes as input
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void increment(int seconds) {
        /*
        increment() that takes in a number of seconds and adds that amount to the time, appropriately handling overflow
    for each measurement of time. Every 60 seconds added to the seconds amount is carried over to the minutes, then the
    same is done for the minutes to the hours, then once 24 hours is reached, hours is set back to 0 to continue to the
    next 24-hour day cycle
         */
        this.seconds += seconds;
        this.minutes += this.seconds / 60;
        this.seconds %= 60;
        this.hours += this.minutes / 60;
        this.minutes %= 60;
        this.hours %= 24;
    }

    public void print(boolean military) {
        /*
        If true, time is printed in military time with the correct formatting, if false, time is printed in the 12-hour
        format with the correct formatting
         */
        if (military) {
            System.out.printf("%02d:%02d:%02d\n", this.hours, this.minutes, this.seconds);
        } else {
            String timeOfDay = "AM";
            if (this.hours < 12) {
            } else {
                this.hours -= 12;
                timeOfDay = "PM";
            }
            System.out.printf("%02d:%02d:%02d %s\n", this.hours, this.minutes, this.seconds, timeOfDay);
        }
    }

    public static Time fromString(String timeString) {
        /*
        Splitting the string by the colon to separate out the hours, minutes, and seconds, then shoving each of those parts
        into an array and assigning each part to a measurement of time
         */
        String[] partsOfTime = timeString.split(":");
        int hours = Integer.parseInt(partsOfTime[0]);
        int minutes = Integer.parseInt(partsOfTime[1]);
        int seconds = Integer.parseInt(partsOfTime[2]);
        return new Time(hours, minutes, seconds);
    }
}
