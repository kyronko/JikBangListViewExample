package com.tjedit.jikbanglistviewexample.datas;

public class Room {
    public int deposit;
    public int month_pay;

    public String location;
    public int floor;
    public String description;

    public Room(int deposit, int month_pay, String location, int floor, String description) {
        this.deposit = deposit;
        this.month_pay = month_pay;
        this.location = location;
        this.floor = floor;
        this.description = description;
    }

}
