package solid;

// requirement
// 1. Transfer money in thailand
// 2. Transfer money (international)

public class DemoBank {
    public static void main(String[] args) {
        //local
        TransferMoneyPocess bankAccount = new LocalBankAccount();
        bankAccount.tranferMoney(100);
        // inter
        TransferMoneyPocess interBankAccount = new InterBankAccount();
        interBankAccount.tranferMoney(5000);
    }
}

enum AccountType {
    Local,
    Inter
}

interface  TransferMoneyPocess {
    void tranferMoney(int money);
}

class LocalBankAccount implements TransferMoneyPocess {
    public void tranferMoney(int money) {
        System.out.println("Transfer money in Thailand only");
    }
}

class InterBankAccount implements TransferMoneyPocess{
    public void tranferMoney(int money) {
        System.out.println("Transfer money international");
    }
}
