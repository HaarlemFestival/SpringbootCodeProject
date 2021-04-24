package com.springbootcodeproject.springbootcodeproject.Controller;

import com.springbootcodeproject.springbootcodeproject.Model.Transaction;
import com.springbootcodeproject.springbootcodeproject.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllTransactions(){
        List<Transaction> transactions = transactionService.getAllTransactions();

        return ResponseEntity.status(200).body(transactions);
    }
}
