package com.lynkmieu.mvpsamplev1.model;

import com.lynkmieu.mvpsamplev1.model.entity.Demo;

import java.util.ArrayList;
import java.util.List;

/*
*- Lớp M: xử lý dữ liệu -> Trả dữ liệu về P thông qua callback
* */

public class UserInterator {
    private LoadDemoListener listener;

    public UserInterator(LoadDemoListener listener) {
        this.listener = listener;
    }

    //Xử lý tạo dữ liệu
    public void createListData(){
        List<Demo> listDemo = new ArrayList<>();
        for (int i = 0 ; i < 10; i++){
            Demo demo = new Demo("I'm Developer!");
            listDemo.add(demo);
        }
        listener.onLoadDemoSuccess(listDemo);
    }
}
