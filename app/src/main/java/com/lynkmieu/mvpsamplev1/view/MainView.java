package com.lynkmieu.mvpsamplev1.view;

import com.lynkmieu.mvpsamplev1.model.entity.Demo;

import java.util.List;

/**
 * Created by LynkMieu on 7/6/2017.
 * - Lớp View định nghĩa các hàm hiển thị dữ liệu
 */

public interface MainView {
    void displayMain(List<Demo> listDemo);
}
