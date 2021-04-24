package com.springbootcodeproject.springbootcodeproject.Service;

import com.springbootcodeproject.springbootcodeproject.Enum.AccountType;
import com.springbootcodeproject.springbootcodeproject.Enum.UserType;
import com.springbootcodeproject.springbootcodeproject.Model.Account;
import com.springbootcodeproject.springbootcodeproject.Model.Transaction;
import com.springbootcodeproject.springbootcodeproject.Model.User;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    private List<Transaction> transactionList = new ArrayList<>();

//    Account sender = new Account("NLxxINHO0xxxxxxxxx", 50, AccountType.Current);
//    Account receiver = new Account("NLxxINHO0xxxxxxxxx", 100, AccountType.Current);
//    User user = new User(3, "bob", "bobob", "bob@mail.com", "bobstraat", "password", UserType.Employee, sender);


//    public TransactionService() {
//        transactionList.add(new Transaction(sender, receiver, 10, user, Timestamp.from(Instant.now())));
//    }

    public List<Transaction> getAllTransactions(){
        return transactionList;
    }
}
