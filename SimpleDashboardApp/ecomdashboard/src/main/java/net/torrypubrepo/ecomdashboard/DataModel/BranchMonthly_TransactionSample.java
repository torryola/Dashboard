package net.torrypubrepo.ecomdashboard.DataModel;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/*
 Created by Toriola

 This is class will create monthly transaction for each branch from where yearly will be cumulated
 */
@Component
public class BranchMonthly_TransactionSample
{
    private final String[] BRANCHES = {"Ecom595", "Ecom478", "Ecom481", "Ecom479",
            "Ecom480", "Ecom482", "Ecom477", "Ecom460"};
    private final String[] BRCH_LOCATIONS_ID = {"Birmingham", "Coventry", "London", "Liverpool", "Manchester",
                                            "Glasgow", "Edinburgh", "Cardiff"};
    private final HashMap<String, String> BRANCH_LOCATIONS = new HashMap<>();
    public static final String[] MONTH_OF_YEAR = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
                                            "Aug", "Sep", "Oct", "Nov", "Dec"};
    private final Integer MIN_TRANSACTION = 1000000;
    private final Integer MAX_TRANSACTION = 1500000;
    private final Integer MIN_MAX_TRANSACTION[] = {MIN_TRANSACTION, MAX_TRANSACTION};

    public BranchMonthly_TransactionSample(){}

    {
        for (int i= 0; i < BRANCHES.length; i++)
            BRANCH_LOCATIONS.put(BRANCHES[i], BRCH_LOCATIONS_ID[i]);
    }

    public List<BranchMonthlyTransaction> createTransaction()
    {
        List<BranchMonthlyTransaction> branchOfficesList = new ArrayList<>();
        for (String branch : BRANCHES)
        {
            for (String s : MONTH_OF_YEAR)
            {
                int salesTarget = MIN_MAX_TRANSACTION[new Random().nextInt(MIN_MAX_TRANSACTION.length)];

                long actualSales = salesTarget + Math.max(30000, new Random().nextInt(200000));

                long salesDiff = actualSales - salesTarget;

                BranchMonthlyTransaction branchMonthlyTransaction = new BranchMonthlyTransaction();

                branchMonthlyTransaction.setBranchId(branch);
                branchMonthlyTransaction.setSalesMonth(s);
                branchMonthlyTransaction.setTargetSales(salesTarget);
                branchMonthlyTransaction.setActualSales(actualSales);
                branchMonthlyTransaction.setSalesDiff(salesDiff);
                branchMonthlyTransaction.setBranchLocation(BRANCH_LOCATIONS.get(branch));

                // Add each Transaction to the list
                branchOfficesList.add(branchMonthlyTransaction);
            }//End inner for
        }//End for
        return branchOfficesList;



    }//End createTransaction


}//End BranchMonthly_TransactionSample
