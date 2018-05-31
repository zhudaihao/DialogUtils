package cn.zdh.library_dialog;

import java.util.List;

/**
 * Created by Administrator on 2018/1/11.
 */

public class bean {

    private List<BankListBean> bankList;
    private List<ListBean> list;

    public List<BankListBean> getBankList() {
        return bankList;
    }

    public void setBankList(List<BankListBean> bankList) {
        this.bankList = bankList;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class BankListBean {
        /**
         * name : 中国工商银行
         * value : ICBC
         */

        private String name;
        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class ListBean {
        /**
         * bankCard : 6214830000000001
         * bankCardShow : **** **** **** 0001
         * bankCardState : 1
         * bankIcon : https://tf.gxyclub.com/bs/201711/80611509938222249.jpg
         * bankName : 招商银行
         * bankTelephone : 13979035484
         * bankTelephoneShow : 139****5484
         * mobilePhone : 19200000006
         * realname : 李涛全测
         * userBankState : 1
         * userRole : 1
         * userRoleName : 投资账户
         * username : litao55
         */

        private String bankCard;
        private String bankCardShow;
        private String bankCardState;
        private String bankIcon;
        private String bankName;
        private String bankTelephone;
        private String bankTelephoneShow;
        private String mobilePhone;
        private String realname;
        private String userBankState;
        private String userRole;
        private String userRoleName;
        private String username;



        public String getBankCard() {
            return bankCard;
        }

        public void setBankCard(String bankCard) {
            this.bankCard = bankCard;
        }

        public String getBankCardShow() {
            return bankCardShow;
        }

        public void setBankCardShow(String bankCardShow) {
            this.bankCardShow = bankCardShow;
        }

        public String getBankCardState() {
            return bankCardState;
        }

        public void setBankCardState(String bankCardState) {
            this.bankCardState = bankCardState;
        }

        public String getBankIcon() {
            return bankIcon;
        }

        public void setBankIcon(String bankIcon) {
            this.bankIcon = bankIcon;
        }

        public String getBankName() {
            return bankName;
        }

        public void setBankName(String bankName) {
            this.bankName = bankName;
        }

        public String getBankTelephone() {
            return bankTelephone;
        }

        public void setBankTelephone(String bankTelephone) {
            this.bankTelephone = bankTelephone;
        }

        public String getBankTelephoneShow() {
            return bankTelephoneShow;
        }

        public void setBankTelephoneShow(String bankTelephoneShow) {
            this.bankTelephoneShow = bankTelephoneShow;
        }

        public String getMobilePhone() {
            return mobilePhone;
        }

        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        public String getRealname() {
            return realname;
        }

        public void setRealname(String realname) {
            this.realname = realname;
        }

        public String getUserBankState() {
            return userBankState;
        }

        public void setUserBankState(String userBankState) {
            this.userBankState = userBankState;
        }

        public String getUserRole() {
            return userRole;
        }

        public void setUserRole(String userRole) {
            this.userRole = userRole;
        }

        public String getUserRoleName() {
            return userRoleName;
        }

        public void setUserRoleName(String userRoleName) {
            this.userRoleName = userRoleName;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }
}


