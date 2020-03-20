package ghu.io.mvpsimple.view;

import java.util.List;

import ghu.io.mvpsimple.model.GoodsBean;

/**
 * @author weitf
 * @create 2020/3/20.
 * @email weitf@ghu.com
 * Describe:
 */
public interface IGoodsView extends IBaseView{
    void obtainGoods(List<GoodsBean> datas);
}
