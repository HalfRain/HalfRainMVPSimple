package ghu.io.mvpsimple.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weitf
 * @create 2020/3/20.
 * @email weitf@ghu.com
 * Describe:
 */
public class GoodsModel {
    public void featchAllGoods(final OnResultCallBackLinister onResultCallBackLinister) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                List<GoodsBean> goodsModels = new ArrayList<>();
                for (int i = 0; i < 100; i++) {
                    goodsModels.add(new GoodsBean("MVP" + i, "http://baidu.com/image/abc" + i, "中国加油" + i));
                }
                onResultCallBackLinister.onSuccess(goodsModels);
            }
        }).start();

    }

    public interface OnResultCallBackLinister {
        void onSuccess(List<GoodsBean> goodsModels);

        void onError(String msg);
    }
}
