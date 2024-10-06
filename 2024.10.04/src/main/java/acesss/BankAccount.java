package acesss;

public class BankAccount {

    private int balance;


    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            System.out.println("기존 금액 : " + balance + " 추가된 금액 " + amount);
            balance += amount;
            System.out.println("ㄴ 총 금액 : " + balance);
        } else {
            System.out.println("유효하지 않은 금액 입니다");
        }
    }
    // public 메서드 : deposit
    public void withdaraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            System.out.println("기존 금액 : " + balance + " 출금된 금액 " + amount);
            balance -= amount;
            System.out.println("ㄴ 총 금액 : " + balance);
        } else {
            System.out.println("유효하지 않은 금액 이거나 잔액이 부족합니다");
        }
    }
    // public 메서드 getter getBalance
    public int getBalance(){
        return balance;
    }

    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }

}
