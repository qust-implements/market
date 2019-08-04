package edu.qust.market.bean;

import java.io.Serializable;

public class Banner implements Serializable {
    private Long imgId;

    private String imgName;

    private String imgInfo;

    private String imgUrl;

    private static final long serialVersionUID = 1L;

    public Long getImgId() {
        return imgId;
    }

    public void setImgId(Long imgId) {
        this.imgId = imgId;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName == null ? null : imgName.trim();
    }

    public String getImgInfo() {
        return imgInfo;
    }

    public void setImgInfo(String imgInfo) {
        this.imgInfo = imgInfo == null ? null : imgInfo.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", imgId=").append(imgId);
        sb.append(", imgName=").append(imgName);
        sb.append(", imgInfo=").append(imgInfo);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}