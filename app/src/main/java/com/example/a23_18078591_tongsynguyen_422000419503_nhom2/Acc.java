package com.example.a23_18078591_tongsynguyen_422000419503_nhom2;

public class Acc {
        private String id;
        private String name;
        private String bank;
        private String account;
        private Double amount;

    public Acc(String id, String name, String bank, String account, Double amount) {
        this.id = id;
        this.name = name;
        this.bank = bank;
        this.account = account;
        this.amount = amount;
    }

    public Acc() {
    }

        public String getId() {
        return id;
    }

        public void setId(String id) {
        this.id = id;
    }

        public String getName() {
        return name;
    }

        public void setName(String name) {
        this.name = name;
    }

        public String getBank() {
        return bank;
    }

        public void setBank(String bank) {
        this.bank = bank;
    }

        public String getAccount() {
        return account;
    }

        public void setAccount(String account) {
        this.account = account;
    }

        public Double getAmount() {
        return amount;
    }

        public void setAmount(Double amount) {
        this.amount = amount;
    }

        @Override
        public String toString() {
        return "Acc{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", bank='" + bank + '\'' +
                ", account='" + account + '\'' +
                ", amount=" + amount +
                '}';
    }
}
