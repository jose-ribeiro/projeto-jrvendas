import Chart from 'react-apexcharts';

function BarChart() {
    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };

    const mockData = {
        labels: {
            categories: ['Careiro', 'Tefe', 'Parintins', 'Iranduba', 'Coari', 'Rio preto', 'Nova olinda', 'Autazes', 'C. Varzea', 'Manacupuru']
        },
        series: [
            {
                name: "% Sucesso",
                data: [1, 2, 3, 4, 5, 6,7,8,9,10]                   
            }
        ]
    };

    return (
        <Chart 
            options ={{...options, xaxis: mockData.labels}}
            series={mockData.series}
            type="bar"
            height="300"
        />       
    );
}

export default BarChart;