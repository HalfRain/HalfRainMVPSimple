package ghu.io.mvpsimple.view;

/**
 * @author weitf
 * @create 2020/3/20.
 * @email weitf@ghu.com
 * Describe:
 */
public interface IBaseView {
    void showMsg(String msg);
    /**
     * 显示dialog
     */
    void showLoading();

    /**
     * 隐藏 dialog
     */

    void hideLoading();

}
