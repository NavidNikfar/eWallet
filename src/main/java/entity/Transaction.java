package entity;

public class Transaction {
    private int rrn;
    private int walletId;
    private int userId;
    private int amount;
    private String typeTransaction;
    private String status;

    public int getRrn() {
        return rrn;
    }

    public int getWalletId() {
        return walletId;
    }

    public void setWalletId(int walletId) {
        this.walletId = walletId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(String typeTransaction) {
        this.typeTransaction = typeTransaction;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Transaction(int walletId, int userId, int amount, String typeTransaction, String status) {
        this.walletId = walletId;
        this.userId = userId;
        this.amount = amount;
        this.typeTransaction = typeTransaction;
        this.status = status;
    }
}
