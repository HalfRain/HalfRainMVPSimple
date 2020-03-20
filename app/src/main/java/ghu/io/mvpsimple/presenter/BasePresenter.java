package ghu.io.mvpsimple.presenter;

import ghu.io.mvpsimple.view.IBaseView;

/**
 * @author weitf
 * @create 2020/3/20.
 * @email weitf@ghu.com
 * Describe:
 */
public class BasePresenter<V extends IBaseView> {
    public V baseView;

    public BasePresenter(V baseView) {
        this.baseView = baseView;
    }

    /**
     * 解除绑定
     */
    public void detachView() {
        baseView = null;
    }
}
