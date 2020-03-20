package ghu.io.mvpsimple;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.ref.WeakReference;

import ghu.io.mvpsimple.presenter.BasePresenter;
import ghu.io.mvpsimple.view.IBaseView;

/**
 * @author weitf
 * @create 2020/3/19.
 * @email weitf@ghu.com
 * Describe: jetpack
 */
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements IBaseView {
    protected P presenter;
    protected MyHandler handler = new MyHandler(this);

    void handlerMsg(Message msg) {
    }

    public class MyHandler extends Handler {
        private WeakReference<BaseActivity> weakReference;

        public MyHandler(BaseActivity baseActivity) {
            this.weakReference = new WeakReference<>(baseActivity);
        }

        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            weakReference.get().handlerMsg(msg);
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        presenter = createPresenter();
        init();
    }

    protected abstract int getLayoutId();

    protected abstract void init();

    protected abstract P createPresenter();

    @Override
    public void showMsg(String msg) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.detachView();
        }
    }
}
