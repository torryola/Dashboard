package net.torrypubrepo.ecomdashboard.Interfaces;

import net.torrypubrepo.ecomdashboard.DataModel.BranchOffices;
import org.springframework.stereotype.Component;

import java.util.List;

/*
 Created by Toriola
 */
@Component
public interface Branch_Service_Interface
{
    public abstract BranchOffices getBranchById(String branchId);
    public abstract List<BranchOffices> getAllBranches();
   // public abstract List<BranchOffices> createNewBranchReports(BranchOffices... branchOffices);
    public abstract BranchOffices createNewBranchReports(BranchOffices branchOffices);


}//End Branch_Service_Interface
