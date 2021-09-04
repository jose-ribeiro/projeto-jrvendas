import Chart from 'react-apexcharts';

function DonutChart() {
    const mockData = {
        series: [1, 2, 3, 4, 5, 6,7,8,9,10],
        labels: ['Careiro', 'Tefe', 'Parintins', 'Iranduba', 'Coari', 'Rio preto', 'Nova olinda', 'Autazes', 'C. Varzea', 'Manacupuru']
    }

    const options = {
        legend: {
            show: true
        }
    }

    return (
        <Chart 
            options ={{...options, labels: mockData.labels}}
            series={mockData.series}
            type="donut"
            height="300"
        />       
    );

}

export default DonutChart;
