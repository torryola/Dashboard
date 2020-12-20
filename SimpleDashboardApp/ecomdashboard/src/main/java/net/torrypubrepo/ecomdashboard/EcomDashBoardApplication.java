package net.torrypubrepo.ecomdashboard;

import net.torrypubrepo.ecomdashboard.DataModel.BranchOffices;
import net.torrypubrepo.ecomdashboard.DataModel.BranchMonthly_TransactionSample;
import net.torrypubrepo.ecomdashboard.Services.BranchReport_ServiceImpl;
import net.torrypubrepo.ecomdashboard.Services.Branch_Monthly_Transaction_ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcomDashBoardApplication implements CommandLineRunner {

	@Autowired
	BranchReport_ServiceImpl branchReport_service;
	@Autowired
	Branch_Monthly_Transaction_ServiceImpl branch_monthly_transaction_service;

	public static void main(String[] args) {
		SpringApplication.run(EcomDashBoardApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{

		long revenue = 1500000000L;
		int actualProfitPercentage = 20;
		long profit = revenue + (revenue * actualProfitPercentage/100);
		// Insert Sample Data
		BranchOffices branchOffices = new BranchOffices();
		branchOffices.setBranchId("Ecom595");
		branchOffices.setBranchManager("Aaro James");
		branchOffices.setBranchLocation("Birmingham");
		branchOffices.setTotalStaff(34);
		branchOffices.setRevenue(revenue);
		branchOffices.setTargetProfit(15);
		branchOffices.setActualProfit(actualProfitPercentage);
		branchOffices.setProfitFigure(profit);
		branchOffices.setReportYear("2010");
		branchOffices.setBranchEstYear("2004");

		// Insert Sample Data
		branchReport_service.createNewBranchReports(branchOffices);

		// Insert Sample Monthly Transaction per Branch
		// Execute on a separate Thread due to the Operation
		Thread threadSampleData = new Thread(() ->{

			System.out.println("=============== Creating Branch Monthly Transactions ======================");
			BranchMonthly_TransactionSample branchMonthly_transactionSample = new BranchMonthly_TransactionSample();
			branch_monthly_transaction_service.createSampleTransaction(branchMonthly_transactionSample.createTransaction());

			System.out.println("=============== Branch Monthly Transactions Created ======================");
		});

		threadSampleData.start();

		threadSampleData.join();

		//branch_monthly_transaction_service.getTotalTransactionByMonths();


	}
}
