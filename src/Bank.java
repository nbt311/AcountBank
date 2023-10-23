package src;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> listAccount;

    public Bank(){
        this.listAccount = new ArrayList<Account>();
    }

    public void addAccount(Account account){
        this.listAccount.add(account);
    }

    public void removeAccount(Account account){}

    public void deposit(Account account,Double money){}

    public void transfer(Account sender,Account receiver,Double money ){
        sender.setBalance(sender.getBalance() -money);
        receiver.setBalance(receiver.getBalance() + money);

        String infoTransactionReceiver = "Da nhan"  + money + "tien";
        String infoTransactionSender = "Da gui " + money + "tien";
        receiver.setTransactions(infoTransactionReceiver);
        sender.setTransactions(infoTransactionSender);
    }
}
