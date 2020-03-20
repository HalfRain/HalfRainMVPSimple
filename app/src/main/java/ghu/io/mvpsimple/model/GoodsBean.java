package ghu.io.mvpsimple.model;

/**
 * @author weitf
 * @create 2020/3/20.
 * @email weitf@ghu.com
 * Describe:
 */
public class GoodsBean {
    private String name;
    private String pic;
    private String contentStr;

    public GoodsBean(String name, String pic, String contentStr) {
        this.name = name;
        this.pic = pic;
        this.contentStr = contentStr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getContentStr() {
        return contentStr;
    }

    public void setContentStr(String contentStr) {
        this.contentStr = contentStr;
    }

    @Override
    public String toString() {
        return "\n name='" + name + '\'' +
                ", pic='" + pic + '\'' +
                ", contentStr='" + contentStr +"\n";
    }
}
