package com.lynkmieu.mvpsamplev1.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.lynkmieu.mvpsamplev1.R;
import com.lynkmieu.mvpsamplev1.model.entity.Demo;
import com.lynkmieu.mvpsamplev1.presenter.MainPresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {
    //Presenter
    private MainPresenter mainPresenter;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPresenter();
        Button btnLoad = (Button) findViewById(R.id.btn_load_data);
        listView = (ListView) findViewById(R.id.list_view);
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mainPresenter.loadData();
            }
        });
    }

    private void initPresenter() {
        mainPresenter = new MainPresenter(this);
    }

    @Override
    public void displayMain(List<Demo> listDemo) {
        listView.setAdapter(new ArrayAdapter<Demo>(this,android.R.layout.simple_list_item_1,listDemo));
    }
}
