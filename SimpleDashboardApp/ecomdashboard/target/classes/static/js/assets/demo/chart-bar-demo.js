// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#292b2c';

// Bar Chart Example
var chlabel =  $("#chlabel").val();
chlabel = chlabel.split(",");

var chdata = $("#chdata").val();
chdata = chdata.split(",")

var ctx = document.getElementById("myBarChart");

var myLineChart = new Chart(ctx,
{
  type: 'bar',
  data: {
    labels: chlabel,
    datasets: [{
      label: "Revenue",
      backgroundColor: "rgba(2,117,216,1)",
      borderColor: "rgba(2,117,216,1)",
      data: chdata,
    }],
  },
  options: {
    scales: {
      xAxes: [{
        time: {
          unit: 'date',
        },
        gridLines: {
          display: false
        },
        ticks: {
          maxTicksLimit: 20
        }
      }],
      yAxes: [{
        ticks: {
          min: 0,
          max: 13000000,
          maxTicksLimit: 15
        },
        gridLines: {
          display: true
        }
      }],
    },
    legend: {
      display: true
    }
  }
});
