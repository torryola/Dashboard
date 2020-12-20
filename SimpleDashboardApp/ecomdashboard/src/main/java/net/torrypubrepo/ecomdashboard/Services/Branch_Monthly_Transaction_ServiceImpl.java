package net.torrypubrepo.ecomdashboard.Services;

import net.torrypubrepo.ecomdashboard.DataModel.BranchMonthlyTransaction;
import net.torrypubrepo.ecomdashboard.Repository.BranchTransaction_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 Created by Toriola
 */
@Service
public class Branch_Monthly_Transaction_ServiceImpl
{
    @Autowired
    private BranchTransaction_Repository branchTransaction_repository;

    public void createSampleTransaction(List<BranchMonthlyTransaction> monthlyTransactions)
    {
        branchTransaction_repository.saveAll(monthlyTransactions);
    }

    public List<BranchMonthlyTransaction> getAllTransactions()
    {
       return branchTransaction_repository.getAllTransactions();
    }

    public TreeMap<String, Long> getTotalTransactionByMonths()
    {
        TreeMap<String, Long> monthLabels = new TreeMap<>();
       List<BranchMonthlyTransaction> monthlyTransactions = branchTransaction_repository.getAllTransactions();
       for (BranchMonthlyTransaction branchMonthlyTransaction : monthlyTransactions)
       {
           String month = branchMonthlyTransaction.getSalesMonth();
           // Check if Month is in MonthLabels
           if (!monthLabels.containsKey(month))
               monthLabels.put(month, branchMonthlyTransaction.getActualSales());
           else
               monthLabels.computeIfPresent(month, (k, v) -> v+=branchMonthlyTransaction.getActualSales());
       }
      // System.out.println(monthLabels.toString());
       return monthLabels;
    }

    public List<BranchMonthlyTransaction> getTransactionByBranchId(String sId)
    {
        return branchTransaction_repository.getTransactionByBranchId(sId);
    }//End getTransactionByBranchId(String sId)

    public String getBranchTotalTransaction(String bId)
    {
        long actualTotal = 0;
        long targetTotal = 0;
        long totalDiff = 0;
        HashMap<String, String> branch = new HashMap<>();

        List<BranchMonthlyTransaction> branchLists = branchTransaction_repository.getTransactionByBranchId(bId);
        for (BranchMonthlyTransaction branchMonthlyTransaction : branchLists)
        {
            actualTotal += branchMonthlyTransaction.getActualSales();
            targetTotal += branchMonthlyTransaction.getTargetSales();
            totalDiff += branchMonthlyTransaction.getSalesDiff();

            branch.put("Branch Code", branchMonthlyTransaction.getBranchId());
            branch.put("Actual Sales ", String.valueOf(actualTotal));
            branch.put(" Sales Target", String.valueOf(targetTotal));
            branch.put("Sales Diff", String.valueOf(totalDiff));
            branch.put("Location", branchMonthlyTransaction.getBranchLocation());
        }
             return branch.toString();
    }//End getBranchTotalTransaction(String bId)

}//End Branch_Monthly_Transaction_Service
