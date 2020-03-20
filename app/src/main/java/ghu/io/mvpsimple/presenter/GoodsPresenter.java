package ghu.io.mvpsimple.presenter;

import java.util.List;

import ghu.io.mvpsimple.model.GoodsBean;
import ghu.io.mvpsimple.model.GoodsModel;
import ghu.io.mvpsimple.view.IGoodsView;

/**
 * @author weitf
 * @create 2020/3/20.
 * @email weitf@ghu.com
 * Describe:
 */
public class GoodsPresenter extends BasePresenter<IGoodsView> {
    private GoodsModel goodsModel;

    public GoodsPresenter(IGoodsView baseView) {
        super(baseView);
        this.goodsModel = new GoodsModel();
    }

    public void obtainAllGoodsInfo() {
        goodsModel.featchAllGoods(new GoodsModel.OnResultCallBackLinister() {
            @Override
            public void onSuccess(List<GoodsBean> goodsModels) {
                baseView.obtainGoods(goodsModels);
            }

            @Override
            public void onError(String msg) {
                baseView.showMsg(msg);
            }
        });
    }

}
