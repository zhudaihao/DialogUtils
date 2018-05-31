package cn.zdh.library_dialog;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/5/8.
 */

public class PriceEntity implements Serializable {
    private int id = 0;
    private int ruleId = 0;
    private int bingoTimes = 0;
    private String bingoTimesStr;
    private String awardItemName = "";
    private String awardName = "";
    private String imageUrl = "";

    private String rewardCoinNum;

    public String getRewardCoinNum() {
        return rewardCoinNum;
    }

    public void setRewardCoinNum(String rewardCoinNum) {
        this.rewardCoinNum = rewardCoinNum;
    }

    public String getBingoTimesStr() {
        return bingoTimesStr;
    }

    public void setBingoTimesStr(String bingoTimesStr) {
        this.bingoTimesStr = bingoTimesStr;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRuleId() {
        return ruleId;
    }

    public void setRuleId(int ruleId) {
        this.ruleId = ruleId;
    }

    public int getBingoTimes() {
        return bingoTimes;
    }

    public void setBingoTimes(int bingoTimes) {
        this.bingoTimes = bingoTimes;
    }

    public String getAwardItemName() {
        return awardItemName;
    }

    public void setAwardItemName(String awardItemName) {
        this.awardItemName = awardItemName;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    private String location;

}
