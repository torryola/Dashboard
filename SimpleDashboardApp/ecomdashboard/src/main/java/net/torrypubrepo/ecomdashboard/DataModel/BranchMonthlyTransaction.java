package net.torrypubrepo.ecomdashboard.DataModel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/*
 Created by Toriola

 Entity representation of each branch monthly transaction Table
 */
@Component
@Entity(name = "MonthlyTransaction")
public class BranchMonthlyTransaction
{
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "branch_generator")
    @SequenceGenerator(name = "branch_generator", sequenceName = "branch_sequence", allocationSize = 100)
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "branchId", nullable = false)
    private String branchId;

    @Column(name = "branchLocation", nullable = false)
    private String branchLocation;

    @Column(name = "targetSales", nullable = false, columnDefinition = "INT default 0")
    private int targetSales;

    @Column(name = "actualSales", nullable = false, columnDefinition = "INT default 0")
    private Long actualSales;

    @Column(name = "salesDiff", nullable = false, columnDefinition = "INT default 0" )
    private Long salesDiff;

    @Column(name = "salesMonth")
    private String salesMonth;

    public BranchMonthlyTransaction() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public int getTargetSales() {
        return targetSales;
    }

    public void setTargetSales(int targetSales) {
        this.targetSales = targetSales;
    }

    public Long getActualSales() {
        return actualSales;
    }

    public void setActualSales(Long actualSales) {
        this.actualSales = actualSales;
    }

    public long getSalesDiff() {
        return salesDiff;
    }

    public void setSalesDiff(long salesDiff) {
        this.salesDiff = salesDiff;
    }

    public String getSalesMonth() {
        return salesMonth;
    }

    public void setSalesMonth(String salesMonth) {
        this.salesMonth = salesMonth;
    }

    @Override
    public String toString() {
        return "BranchMonthlyTransaction{" +
                "Id=" + Id +
                ", branchId='" + branchId + '\'' +
                ", branchLocation='" + branchLocation + '\'' +
                ", targetSales=" + targetSales +
                ", actualSales=" + actualSales +
                ", salesDiff=" + salesDiff +
                ", salesMonth='" + salesMonth + '\'' +
                '}';
    }
}//End BranchMonthlyTransaction
