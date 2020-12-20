package net.torrypubrepo.ecomdashboard.Repository;

import net.torrypubrepo.ecomdashboard.DataModel.BranchMonthlyTransaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 Created by Toriola
 Repository for Sample Branch Monthly Transactions
 */
@Repository
public interface BranchTransaction_Repository extends CrudRepository<BranchMonthlyTransaction, Long>
{
    @Query("SELECT m FROM MonthlyTransaction m")
    public abstract List<BranchMonthlyTransaction> getAllTransactions();

    @Query("SELECT b FROM MonthlyTransaction b WHERE b.branchId = :branch")
    public abstract List<BranchMonthlyTransaction> getTransactionByBranchId(@Param("branch") String branchId);

   // @Query(" SELECT m.branchId ,SUM(m.actualSales) ,m.branchLocation ,SUM(m.salesDiff) , SUM(m.targetSales)" +
           // " FROM MonthlyTransaction m WHERE m.branchId = :branch  GROUP BY m.branchId ")
   // public abstract BranchMonthlyTransaction getBranchTotalYearTransaction(@Param(value = "branch") String branchId);

    /* SELECT ID ,ACTUAL_SALES ,BRANCH_ID ,BRANCH_LOCATION ,SALES_DIFF ,TARGET_SALES
    FROM MONTHLY_TRANSACTION;

    SELECT BRANCH_ID ,SUM(ACTUAL_SALES) ,BRANCH_LOCATION ,SUM(SALES_DIFF) , SUM(TARGET_SALES)
    FROM MONTHLY_TRANSACTION GROUP BY BRANCH_ID;
    */

}//End BranchTransaction_Repository
