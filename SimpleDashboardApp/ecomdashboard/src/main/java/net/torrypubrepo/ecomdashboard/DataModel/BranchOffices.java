package net.torrypubrepo.ecomdashboard.DataModel;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/*
 Created by Toriola

 This is the Entity for each Branch
  */
@Component
@Entity(name = "BranchOffices")
public class BranchOffices
{
    @Id
   // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "report_generator")
    //@SequenceGenerator(name = "report_generator", sequenceName = "report_sequence", allocationSize = 100)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "branchId", unique = true, nullable = false)
    private String branchId;
    @Column(name = "branchManager", nullable = false)
    private String branchManager;
    @Column(name = "branchLocation", nullable = false)
    private String branchLocation;

    @Column(name = "totalStaff", nullable = false)
    private int totalStaff;

    @Column(name = "revenue", nullable = false, columnDefinition = "INT default 0")
    private Long revenue;

    @Column(name = "targetProfit", nullable = false, columnDefinition = "INT default 10")
    private int targetProfit; // in Percentage

    @Column(name = "actualProfit", nullable = false, columnDefinition = "INT default 0" )
    private int actualProfit; // in Percentage

    @Column(name = "profitFigure", nullable = false, columnDefinition = "INT default 0")
    private Long profitFigure;

    @Column(name = "reportYear")
    private String reportYear;
    @Column(name = "branchEstYear")
    private String branchEstYear;

    public BranchOffices() {
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

    public String getBranchManager() {
        return branchManager;
    }

    public void setBranchManager(String branchManager) {
        this.branchManager = branchManager;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }

    public Long getRevenue() {
        return revenue;
    }

    public void setRevenue(Long revenue) {
        this.revenue = revenue;
    }

    public int getTargetProfit() {
        return targetProfit;
    }

    public void setTargetProfit(int targetProfit) {
        this.targetProfit = targetProfit;
    }

    public int getActualProfit() {
        return actualProfit;
    }

    public void setActualProfit(int actualProfit) {
        this.actualProfit = actualProfit;
    }

    public Long getProfitFigure() {
        return profitFigure;
    }

    public void setProfitFigure(Long profitFigure) {
        this.profitFigure = profitFigure;
    }

    public String getReportYear() {
        return reportYear;
    }

    public void setReportYear(String reportYear) {
        this.reportYear = reportYear;
    }

    public String getBranchEstYear() {
        return branchEstYear;
    }

    public void setBranchEstYear(String branchEstYear) {
        this.branchEstYear = branchEstYear;
    }

    @Override
    public String toString() {
        return "BranchOffices{" +
                "Id=" + Id +
                ", branchId='" + branchId + '\'' +
                ", branchManager='" + branchManager + '\'' +
                ", branchLocation='" + branchLocation + '\'' +
                ", totalStaff=" + totalStaff +
                ", revenue=" + revenue +
                ", targetProfit=" + targetProfit +
                ", actualProfit=" + actualProfit +
                ", profitFigure=" + profitFigure +
                ", reportYear='" + reportYear + '\'' +
                ", branchEstYear='" + branchEstYear + '\'' +
                '}';
    }
}//End BranchOffices
