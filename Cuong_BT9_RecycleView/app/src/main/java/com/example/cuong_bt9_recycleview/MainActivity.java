package com.example.cuong_bt9_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvComputer;
    private ComputerAdapter computerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvComputer= findViewById(R.id.rcv_computer);
        computerAdapter = new ComputerAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvComputer.setLayoutManager(linearLayoutManager);

        computerAdapter.setData(getListComputer());
        rcvComputer.setAdapter(computerAdapter);

    }
    private List<Computer> getListComputer(){
        List<Computer> list = new ArrayList<>();
        list.add(new Computer(R.drawable.maytinh1, "Lenovo Ideapad 3 "));
        list.add(new Computer(R.drawable.maytinh2, "Lenovo IdeaPad 5"));
        list.add(new Computer(R.drawable.maytinhlenovo, "Lenovo IdeaPad Slim 7"));
        list.add(new Computer(R.drawable.maytinhlenovo2, "Lenovo Yoga Slim 7 AMD"));

        list.add(new Computer(R.drawable.maytinh1, "Lenovo Ideapad 3 ryzen 7"));
        list.add(new Computer(R.drawable.maytinh2, "Lenovo IdeaPad 5"));
        list.add(new Computer(R.drawable.maytinhlenovo, "Lenovo IdeaPad Slim 7"));
        list.add(new Computer(R.drawable.maytinhlenovo2, "Lenovo Yoga Slim 7 AMD"));

        list.add(new Computer(R.drawable.maytinh1, "Lenovo Ideapad 3 ryzen 7"));
        list.add(new Computer(R.drawable.maytinh2, "Lenovo IdeaPad 5"));
        list.add(new Computer(R.drawable.maytinhlenovo, "Lenovo IdeaPad Slim 7"));
        list.add(new Computer(R.drawable.maytinhlenovo2, "Lenovo Yoga Slim 7 AMD"));
        return list;
    }
}