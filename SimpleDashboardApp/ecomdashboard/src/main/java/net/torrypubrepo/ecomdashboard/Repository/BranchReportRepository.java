package net.torrypubrepo.ecomdashboard.Repository;

import net.torrypubrepo.ecomdashboard.DataModel.BranchOffices;
import net.torrypubrepo.ecomdashboard.Interfaces.Branch_Service_Interface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 Created by Toriola Oct
 */
@Repository
public interface BranchReportRepository extends JpaRepository<BranchOffices, Long>
{
    @Query("SELECT b FROM BranchOffices b WHERE b.branchId = :branchId")
    public abstract BranchOffices getBranchByBranchId(@Param("branchId") String branchId);

    //public abstract List<BranchOffices> getAllBranches();
}
