package ghu.io.mvpsimple;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.List;

import ghu.io.mvpsimple.model.GoodsBean;
import ghu.io.mvpsimple.presenter.GoodsPresenter;
import ghu.io.mvpsimple.view.IGoodsView;

public class MainActivity extends BaseActivity<GoodsPresenter> implements IGoodsView {
    private TextView tv;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        tv = findViewById(R.id.tv);
        presenter.obtainAllGoodsInfo();
    }

    @Override
    protected GoodsPresenter createPresenter() {
        return new GoodsPresenter(this);
    }

    @Override
    public void obtainGoods(final List<GoodsBean> datas) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                StringBuilder sb = new StringBuilder();
                for (GoodsBean data : datas) {
                    sb.append(data.toString());
                }
                tv.setText(sb.toString());
            }
        });
    }

}
