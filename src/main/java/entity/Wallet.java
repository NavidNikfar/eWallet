package entity;

public class Wallet {
    private int walletID;
    private int userId;
    private int balance;

    public int getWalletID() {
        return walletID;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Wallet(int userId, int balance) {
        this.userId = userId;
        this.balance = balance;
    }
}
