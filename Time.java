public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid time format");
        }
    }

    public void nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour = (hour + 1) % 24;
            }
        }
    }

    public void previousSecond() {
        second--;
        if (second == -1) {
            second = 59;
            minute--;
            if (minute == -1) {
                minute = 59;
                hour = (hour - 1 + 24) % 24;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}