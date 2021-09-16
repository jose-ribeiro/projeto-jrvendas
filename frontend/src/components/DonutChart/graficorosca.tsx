import axios from 'axios';
import { useEffect, useState } from 'react';
import Chart from 'react-apexcharts';
import { SomaCidades } from 'types/AtendimentosCidade';
import { BASE_URL } from 'utils/requests';

type ChartData = {
    labels: string[];
    series: number[];
}
const DonutChart = () => {

    const [chartData, setChartData] = useState<ChartData>({ labels: [], series: [] });

    useEffect(() => {
        axios.get(`${BASE_URL}/dados/soma-vendedores`)
            .then(response => {
                const data = response.data as SomaCidades[];
                const myLabels = data.map(x => x.nomeCidade);
                const mySeries = data.map(x => x.sum);

                setChartData({ labels: myLabels, series: mySeries });
            });
    }, []);

    const options = {
        legend: {
            show: true
        }
    }

    return (
        <Chart 
            options ={{...options, labels: chartData.labels}}
            series={chartData.series}
            type="donut"
            height="300"
        />       
    );

}

export default DonutChart;
