package com.tjedit.jikbanglistviewexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tjedit.jikbanglistviewexample.adapters.RoomAdapter;
import com.tjedit.jikbanglistviewexample.databinding.ActivityMainBinding;
import com.tjedit.jikbanglistviewexample.datas.Room;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RoomAdapter mRoomAdapter;

    List<Room> roomList = new ArrayList<>();
    ActivityMainBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);

        act.cleanRoomCounTxt.setText("32개");

        fillRooms();

        mRoomAdapter = new RoomAdapter(MainActivity.this, roomList);
        act.roomListView.setAdapter(mRoomAdapter);


    }

    void fillRooms() {
        roomList.add(new Room(500, 30, "서구 둔산동", 7, "타임월드 인근"));
        roomList.add(new Room(500, 40, "북구 둔산동", 3, "갤러리 인근"));
        roomList.add(new Room(500, 35, "남구 둔산동", 10, "타드 인근"));
        roomList.add(new Room(500, 40, "동구 둔산동", 15, "월드 인근"));
        roomList.add(new Room(500, 35, "북구 둔산동", 15, "타임월드 인근"));
        roomList.add(new Room(500, 30, "서구 둔산동", 7, "타임월드 인근"));
        roomList.add(new Room(500, 40, "북구 둔산동", 3, "갤러리 인근"));
        roomList.add(new Room(500, 35, "남구 둔산동", 10, "타드 인근"));
        roomList.add(new Room(500, 40, "동구 둔산동", 15, "월드 인근"));
        roomList.add(new Room(500, 35, "북구 둔산동", 15, "타임월드 인근"));
        roomList.add(new Room(500, 30, "서구 둔산동", 7, "타임월드 인근"));
        roomList.add(new Room(500, 40, "북구 둔산동", 3, "갤러리 인근"));
        roomList.add(new Room(500, 35, "남구 둔산동", 10, "타드 인근"));
        roomList.add(new Room(500, 40, "동구 둔산동", 15, "월드 인근"));
        roomList.add(new Room(500, 35, "북구 둔산동", 15, "타임월드 인근"));
    }
}
