--insert into branch_offices (actual_profit, branch_est_year, branch_id, branch_location,
 --branch_manager, profit_figure, report_year, revenue, target_profit, total_staff, id)
 --values ("690000000","2000, "Ecom478", "London", "Micheal Jones", "15", "2010", "60000000", 10, "25", 2)

-- Note ==> Use single quote to wrap values not double quote
 INSERT INTO BRANCH_OFFICES (ID, ACTUAL_PROFIT, BRANCH_EST_YEAR, BRANCH_ID, BRANCH_LOCATION,
 BRANCH_MANAGER, PROFIT_FIGURE, REPORT_YEAR, REVENUE, TARGET_PROFIT, TOTAL_STAFF)
  VALUES(2, 15,'2000', 'Ecom478', 'London', 'Michael Jones', 690000000, '2010', 60000000, 10, 25),
  (3,11,'2001', 'Ecom479', 'Manchester', 'Gordon White', 77700000, '2010', 70000000, 10, 40),
  (4, 9,'2002', 'Ecom480', 'Liverpool', 'Mike Nike', 54500000, '2010', 50000000, 10, 20),
  (5, 20,'2005', 'Ecom481', 'London', 'Jack Jones', 120000000, '2010', 100000000, 10, 55),
  (6, 14,'2008', 'Ecom482', 'Coventry', 'Louise Malcom', 45600000, '2010', 40000000, 10, 20);