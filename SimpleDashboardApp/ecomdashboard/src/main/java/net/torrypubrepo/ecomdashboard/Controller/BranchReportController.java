package net.torrypubrepo.ecomdashboard.Controller;

import net.torrypubrepo.ecomdashboard.DataModel.BranchMonthlyTransaction;
import net.torrypubrepo.ecomdashboard.Services.Branch_Monthly_Transaction_ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 Created by Toriola
 */
@RestController
@RequestMapping(value = "/BranchReport")
public class BranchReportController
{
    @Autowired
    Branch_Monthly_Transaction_ServiceImpl branch_monthly_transaction_service;

    @GetMapping(value = "/branch")
    public List<BranchMonthlyTransaction> getBranchTransactById(@RequestParam(name = "id") String sId)
    {

        return branch_monthly_transaction_service.getTransactionByBranchId(sId);
    }

    @GetMapping(value = "/salesTotal")
    public String getBranchTotalSalesId(@RequestParam(name = "id") String sId)
    {

        return branch_monthly_transaction_service.getBranchTotalTransaction(sId);
    }
    @GetMapping(value = "/all")
    public List<BranchMonthlyTransaction> getAllBranchTransactions()
    {
        return branch_monthly_transaction_service.getAllTransactions();
    }

}//End BranchReportController
