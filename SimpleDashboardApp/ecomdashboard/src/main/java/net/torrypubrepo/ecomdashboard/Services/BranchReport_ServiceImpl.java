package net.torrypubrepo.ecomdashboard.Services;

import net.torrypubrepo.ecomdashboard.DataModel.BranchOffices;
import net.torrypubrepo.ecomdashboard.Interfaces.Branch_Service_Interface;
import net.torrypubrepo.ecomdashboard.Repository.BranchReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 Created by Toriola Oct
 */
@Service
public class BranchReport_ServiceImpl implements Branch_Service_Interface
{
    @Autowired
    BranchReportRepository branchReportRepository;

    @Override
    public BranchOffices getBranchById(String branchId)
    {
        return branchReportRepository.getBranchByBranchId(branchId);
    }

    @Override
    public List<BranchOffices> getAllBranches()
    {
        return branchReportRepository.findAll();
    }

    @Override
    public BranchOffices createNewBranchReports(BranchOffices branchOffices) {
        return branchReportRepository.save(branchOffices);
    }
}//BranchReport_ServiceImpl
